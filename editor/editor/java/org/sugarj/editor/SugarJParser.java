package org.sugarj.editor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoString;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.jsglr_layout.client.InvalidParseTableException;
import org.spoofax.jsglr_layout.client.KeywordRecognizer;
import org.spoofax.jsglr_layout.client.ParseTable;
import org.spoofax.jsglr_layout.client.SGLR;
import org.spoofax.jsglr_layout.client.imploder.IToken;
import org.spoofax.jsglr_layout.client.imploder.Token;
import org.spoofax.jsglr_layout.client.imploder.Tokenizer;
import org.spoofax.jsglr_layout.client.imploder.TreeBuilder;
import org.spoofax.jsglr_layout.shared.BadTokenException;
import org.spoofax.jsglr_layout.shared.SGLRException;
import org.spoofax.terms.attachments.ParentAttachment;
import org.strategoxt.imp.runtime.parser.JSGLRI;
import org.strategoxt.imp.runtime.services.ContentProposer;
import org.sugarj.LanguageLib;
import org.sugarj.LanguageLibFactory;
import org.sugarj.LanguageLibRegistry;
import org.sugarj.common.ATermCommands;
import org.sugarj.common.CommandExecution;
import org.sugarj.common.Environment;
import org.sugarj.common.FileCommands;
import org.sugarj.common.Log;
import org.sugarj.common.path.AbsolutePath;
import org.sugarj.common.path.Path;
import org.sugarj.common.path.RelativeSourceLocationPath;
import org.sugarj.driver.Driver;
import org.sugarj.driver.ModuleSystemCommands;
import org.sugarj.driver.Result;
import org.sugarj.driver.RetractableTreeBuilder;
import org.sugarj.driver.STRCommands;
import org.sugarj.driver.caching.ModuleKeyCache;
import org.sugarj.stdlib.StdLib;

/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class SugarJParser extends JSGLRI {

  private Environment environment;
  
  private static Map<String, Result> results = new HashMap<String, Result>();
  private static Set<String> pending = new HashSet<String>();
  
  private Result result;
//  private JSGLRI parser;
//  private Path parserTable;
  
  public SugarJParser(JSGLRI parser) {
    super(parser.getParseTable(), parser.getStartSymbol(), parser.getController());
  }
  
  
  @Override
  protected IStrategoTerm doParse(String input, String filename) throws IOException {
    
    assert environment != null;
    
    if (!LanguageLibRegistry.getInstance().isRegistered(FileCommands.getExtension(filename)))
      return null;

    this.result = null;
    Result result = getResult(filename);

    if (result == null)
      result = parseFailureResult(filename);

    if (input.contains(ContentProposer.COMPLETION_TOKEN) && result != null && result.getParseTable() != null) {
      this.result = result;
      return parseCompletionTree(input, filename, result);
    }

    if (result.isUpToDateShallow(input.hashCode(), environment)) {
      this.result = result;
      return result.getSugaredSyntaxTree();
    }
    
    if (!isPending(filename)) 
      scheduleParse(input, filename);
    
    return result.getSugaredSyntaxTree();
  }
  
  private synchronized void scheduleParse(final String input, final String filename) {
    SugarJParser.setPending(filename, true);

    final RelativeSourceLocationPath sourceFile = ModuleSystemCommands.locateSourceFile(filename, environment.getSourcePath());
    final LanguageLibFactory factory = LanguageLibRegistry.getInstance().getLanguageLib(FileCommands.getExtension(filename));
    
    Job parseJob = new Job("SugarJ parser: " + sourceFile.getRelativePath()) {
      @Override
      protected IStatus run(IProgressMonitor monitor) {
        monitor.beginTask("parse " + sourceFile.getRelativePath(), IProgressMonitor.UNKNOWN);
        Result result = null;
        boolean ok = false;
        try {
          result = runParser(input, sourceFile, factory, monitor);
          ok = true;
        } catch (InterruptedException e) {
          result = null;
        } catch (Exception e) {
          org.strategoxt.imp.runtime.Environment.logException(e);
        } finally {
          monitor.done();
          SugarJParser.this.result = result;
          SugarJParser.putResult(filename, result);
          SugarJParser.setPending(filename, false);
          if (ok)
            getController().scheduleParserUpdate(0, false);
        }
        return Status.OK_STATUS;
      }
    };
    parseJob.schedule();
  }
  
  private Result runParser(String input, RelativeSourceLocationPath sourceFile, LanguageLibFactory factory, IProgressMonitor monitor) throws InterruptedException {
    CommandExecution.SILENT_EXECUTION = false;
    CommandExecution.SUB_SILENT_EXECUTION = false;
    CommandExecution.FULL_COMMAND_LINE = true;
    
    Log.out = SugarJConsole.getOutputPrintStream();
    Log.err = SugarJConsole.getErrorPrintStream();
    SugarJConsole.activateConsoleOnce();
    
    try {
      return Driver.parse(input, sourceFile, monitor, factory);
    } catch (InterruptedException e) {
      throw e;
    } catch (Exception e) {
      e.printStackTrace();
      throw new RuntimeException("parsing " + FileCommands.fileName(sourceFile) + " failed", e);
    }
  }
  
  
  public void setEnvironment(Environment environment) {
    this.environment = environment;
  }
  
  @Override
  public Set<org.spoofax.jsglr.shared.BadTokenException> getCollectedErrors() {
    if (result == null)
      return Collections.emptySet();
    
    Set<org.spoofax.jsglr.shared.BadTokenException> res = new HashSet<org.spoofax.jsglr.shared.BadTokenException>();
    for (BadTokenException e : result.getParseErrors())
      res.add(new org.spoofax.jsglr.shared.BadTokenException(null, e.getToken(), e.getOffset(), e.getLineNumber(), e.getColumnNumber()));
    return res;
  }


  public List<IStrategoTerm> getEditorServices() {
    final List<IStrategoTerm> empty = Collections.emptyList();
    return result == null ? empty : new ArrayList<IStrategoTerm>(result.getEditorServices());
  }

  private static Result getResult(String file) {
    synchronized (results) {
      return results.get(file);
    }
  }
  
  public static void putResult(String file, Result result) {
    if (result != null)
      result.setSugaredSyntaxTree(ATermCommands.fixTokenizer(result.getSugaredSyntaxTree()));
    synchronized (results) {
      results.put(file, result);
    }
  }
  
  private static boolean isPending(String file) {
    synchronized (pending) {
      return pending.contains(file);      
    }
  }
  
  private static void setPending(String file, boolean isPending) {
    synchronized (pending) {
      if (isPending)
        pending.add(file);
      else
        pending.remove(file);
    }
  }
  
  private Result parseFailureResult(String filename) throws FileNotFoundException, IOException {
    Tokenizer tokenizer = new Tokenizer(" ", " ", new KeywordRecognizer(null) {});
    Token tok = tokenizer.makeToken(0, IToken.TK_UNKNOWN, true);
    IStrategoTerm term = ATermCommands.makeList("SugarCompilationUnit", tok);
    
    Result r = new Result(true) {
      public boolean isUpToDateShallow(int h, Environment env) { return false; }
      public boolean isUpToDate(int h, Environment env) { return false; }
    };
    r.setSugaredSyntaxTree(term);
    r.registerEditorDesugarings(getInitialTrans(LanguageLibRegistry.getInstance().getLanguageLib(FileCommands.getExtension(filename))));
    return r;
  }
  
  private IStrategoTerm parseCompletionTree(String input, String filename, Result result) throws IOException {

    RetractableTreeBuilder treeBuilder = new RetractableTreeBuilder();
    ParseTable table;
    try {
      table = ATermCommands.parseTableManager.loadFromFile(result.getParseTable().getAbsolutePath());
    } catch (InvalidParseTableException e) {
      Log.log.logErr(e.getMessage());
      return null;
    }
    SGLR parser = new SGLR(treeBuilder, table);
    parser.setUseStructureRecovery(true);

    String remainingInput = input;
    List<IStrategoTerm> list = new LinkedList<IStrategoTerm>();
    
    while (true) {
      if (remainingInput == null || remainingInput.isEmpty())
        return null;

      IStrategoTerm term;
      try {
        term = (IStrategoTerm) parser.parse(remainingInput, filename, "NextToplevelDeclaration");
      } catch (SGLRException e) {
        return null;
      } catch (InterruptedException e) {
        return null;
      }
      
      if (!ATermCommands.isApplication(term, "NextToplevelDeclaration"))
        return null;
      
      IStrategoTerm nextDecl = ATermCommands.getApplicationSubterm(term, "NextToplevelDeclaration", 0);
      list.add(nextDecl);
      if (nextDecl.toString().contains(ContentProposer.COMPLETION_TOKEN)) {
        IStrategoList termList = ATermCommands.makeList("NextToplevelDeclaration", list);
        
        IStrategoList listIt = termList;
        while (!listIt.isEmpty()) {
          ParentAttachment.putParent(listIt.head(), termList, listIt);
          listIt = listIt.tail();
        }
        
        return termList;
      }
        
      IStrategoTerm remainingInputTerm = ATermCommands.getApplicationSubterm(term, "NextToplevelDeclaration", 1);
      treeBuilder.retract(remainingInputTerm);
      remainingInput = ((IStrategoString) remainingInputTerm).stringValue();
    }
  }
  
  private Path initialTrans = null;

  @SuppressWarnings("unchecked")
  private Path getInitialTrans(LanguageLibFactory factory) throws FileNotFoundException, IOException {
    LanguageLib langLib = factory.createLanguageLibrary();
    if (initialTrans != null && FileCommands.exists(initialTrans))
      return initialTrans;
    Path strCachePath = environment.createCachePath("strCache");
    ModuleKeyCache<Path> strCache = null;
    try {
      strCache = (ModuleKeyCache<Path>) new ObjectInputStream(
          new FileInputStream(strCachePath.getFile())).readObject();
    } catch (Exception e) {
      strCache = new ModuleKeyCache<Path>();
      if (environment.getCacheDir().getFile() != null
          && environment.getCacheDir().getFile().exists())
        for (File f : environment.getCacheDir().getFile().listFiles())
          if (f.getPath().endsWith(".jar"))
            f.delete();
    }
    try {
      initialTrans = STRCommands.compile(
          new AbsolutePath(langLib.getInitTrans().getPath()),
          "main",
          new LinkedList<Path>(),
          new SGLR(new TreeBuilder(), ATermCommands.parseTableManager.loadFromFile(StdLib.strategoTbl.getPath())),
          org.strategoxt.strj.strj.init(), strCache, environment, langLib);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
    return initialTrans;
  }
}
