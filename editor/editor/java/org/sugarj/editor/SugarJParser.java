package org.sugarj.editor;

import java.io.FileNotFoundException;
import java.io.IOException;
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
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.core.runtime.jobs.Job;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoString;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.spoofax.jsglr.client.InvalidParseTableException;
import org.spoofax.jsglr.client.KeywordRecognizer;
import org.spoofax.jsglr.client.ParseTable;
import org.spoofax.jsglr.client.SGLR;
import org.spoofax.jsglr.client.imploder.IToken;
import org.spoofax.jsglr.client.imploder.Token;
import org.spoofax.jsglr.client.imploder.Tokenizer;
import org.spoofax.jsglr.shared.BadTokenException;
import org.spoofax.jsglr.shared.SGLRException;
import org.spoofax.terms.attachments.ParentAttachment;
import org.strategoxt.imp.runtime.parser.JSGLRI;
import org.strategoxt.imp.runtime.services.ContentProposerSemantic;
import org.sugarj.AbstractBaseLanguage;
import org.sugarj.BaseLanguageRegistry;
import org.sugarj.common.ATermCommands;
import org.sugarj.common.CommandExecution;
import org.sugarj.common.Environment;
import org.sugarj.common.FileCommands;
import org.sugarj.common.Log;
import org.sugarj.common.path.AbsolutePath;
import org.sugarj.common.path.RelativePath;
import org.sugarj.driver.Driver;
import org.sugarj.driver.ModuleSystemCommands;
import org.sugarj.driver.Result;
import org.sugarj.driver.RetractableTreeBuilder;
import org.sugarj.stdlib.StdLib;

/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class SugarJParser extends JSGLRI {

  private Environment environment;
  
  private static Map<String, Result> results = new HashMap<String, Result>();
  private static Set<String> pending = new HashSet<String>();
  
  private final static int PARELLEL_PARSES = 3;
  private final static List<ISchedulingRule> schedulingRules = new LinkedList<ISchedulingRule>();
  private static int nextSchedulingRule = 0;
  static {
    for (int i = 0; i < PARELLEL_PARSES; i++) {
      schedulingRules.add(new ISchedulingRule() {
        @Override
        public boolean isConflicting(ISchedulingRule rule) { return rule == this; }
        @Override
        public boolean contains(ISchedulingRule rule) { return rule == this; }
      });
    }
  }
  private synchronized static ISchedulingRule nextSchedulingRule() {
    if (nextSchedulingRule >= schedulingRules.size())
      nextSchedulingRule = 0;
    return schedulingRules.get(nextSchedulingRule++);
  }
  
  private String filename;
//  private Result result;
//  private JSGLRI parser;
//  private Path parserTable;
  
  public SugarJParser(JSGLRI parser) {
    super(parser.getParseTable(), parser.getStartSymbol(), parser.getController());
  }
  
  
  @Override
  protected IStrategoTerm doParse(String input, String filename) throws IOException {
    this.filename = filename;
    
    if (environment == null && getController().getProject() != null)
      environment = SugarJParseController.makeProjectEnvironment(getController().getProject().getRawProject());
    assert environment != null;
    
    if (!BaseLanguageRegistry.getInstance().isRegistered(FileCommands.getExtension(filename))) {
      Log.log.logErr("Unknown source-file extension " + FileCommands.getExtension(filename), Log.ALWAYS);
      return parseFailureResult(filename).getSugaredSyntaxTree();
    }

    Result result = getResult(filename);

    if (result == null)
      result = parseFailureResult(filename);

    if (input.contains(ContentProposerSemantic.COMPLETION_TOKEN) && result != null && result.getParseTable() != null)
      return parseCompletionTree(input, filename, result);

    if (result.getSugaredSyntaxTree() != null && result.isUpToDateShallow(input.hashCode(), environment))
      return result.getSugaredSyntaxTree();

    if (result.getSugaredSyntaxTree() == null)
      return parseFailureResult(filename).getSugaredSyntaxTree();
    
    if (!isPending(filename)) 
      scheduleParse(input, filename);
    
    return result.getSugaredSyntaxTree();
  }
  
  private synchronized void scheduleParse(final String input, final String filename) {
    if (environment == null) {
      getController().scheduleParserUpdate(200, false);
      return;
    }
    
    final RelativePath sourceFile = ModuleSystemCommands.locateSourceFile(filename, environment.getSourcePath());
    assert sourceFile != null;
    
    final AbstractBaseLanguage factory = BaseLanguageRegistry.getInstance().getBaseLanguage(FileCommands.getExtension(filename));

    SugarJParser.setPending(filename, true);
    
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
          SugarJParser.putResult(filename, result);
          SugarJParser.setPending(filename, false);
          if (ok)
            getController().scheduleParserUpdate(0, false);
        }
        return Status.OK_STATUS;
      }
    };
    
    parseJob.setRule(nextSchedulingRule());
    parseJob.schedule();
  }
  
  private Result runParser(String input, RelativePath sourceFile, AbstractBaseLanguage factory, IProgressMonitor monitor) throws InterruptedException {
    CommandExecution.SILENT_EXECUTION = false;
    CommandExecution.SUB_SILENT_EXECUTION = false;
    CommandExecution.FULL_COMMAND_LINE = true;
    
    Log.out = SugarJConsole.getOutputPrintStream();
    Log.err = SugarJConsole.getErrorPrintStream();
    SugarJConsole.activateConsoleOnce();
    
    try {
      return Driver.run(input, sourceFile, environment, monitor, factory);
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
    Result result = getResult(filename);
    if (result == null)
      return Collections.emptySet();
    
    Set<org.spoofax.jsglr.shared.BadTokenException> res = new HashSet<org.spoofax.jsglr.shared.BadTokenException>();
    for (BadTokenException e : result.getParseErrors())
      res.add(new org.spoofax.jsglr.shared.BadTokenException(null, e.getToken(), e.getOffset(), e.getLineNumber(), e.getColumnNumber()));
    return res;
  }


  public List<IStrategoTerm> getEditorServices() {
    final List<IStrategoTerm> empty = Collections.emptyList();
    Result result = getResult(filename);
    return result == null ? empty : new ArrayList<IStrategoTerm>(result.getEditorServices());
  }
  
  public boolean isInitialized() {
    return filename != null;
  }

  private static Result getResult(String file) {
    synchronized (results) {
      return results.get(file);
    }
  }
  
  public static void putResult(String file, Result result) {
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
    ITermFactory f = ATermCommands.factory;
    IStrategoTerm tbl =
      f.makeAppl(f.makeConstructor("parse-table", 5), 
          f.makeInt(6),
          f.makeInt(0),
          f.makeList(),
          f.makeAppl(f.makeConstructor("states", 1), f.makeList()),
          f.makeAppl(f.makeConstructor("priorities", 1), 
                     f.makeList(f.makeAppl(f.makeConstructor("arg-gtr-prio", 3), 
                                           f.makeInt(257), f.makeInt(1), f.makeInt(257))))); // XXX

    ParseTable pt = null; 
    try {
      pt = new ParseTable(tbl, f);
    } catch (InvalidParseTableException e) {
      throw new RuntimeException(e);
    }

    Tokenizer tokenizer = new Tokenizer(" ", " ", new KeywordRecognizer(pt) {});
    Token tok = tokenizer.makeToken(0, IToken.TK_UNKNOWN, true);
    IStrategoTerm term = ATermCommands.makeList("CompilationUnit", tok);
    
    Result r = new Result() {
      public boolean isUpToDateShallow(int h, Environment env) { return false; }
      public boolean isUpToDate(int h, Environment env) { return false; }
    };
    r.setSugaredSyntaxTree(term);
    r.registerEditorDesugarings(new AbsolutePath(StdLib.failureTrans.getAbsolutePath()));
    return r;
  }
  
  private IStrategoTerm parseCompletionTree(String input, String filename, Result result) throws IOException {
    //TODO fix: adapt to parsing with parseMax
    RetractableTreeBuilder treeBuilder = new RetractableTreeBuilder();
    ParseTable table;
    try {
      table = ATermCommands.parseTableManager.loadFromFile(result.getParseTable().getAbsolutePath());
    } catch (InvalidParseTableException e) {
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
      if (nextDecl.toString().contains(ContentProposerSemantic.COMPLETION_TOKEN)) {
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
  
//  private Path initialTrans = null;
//
//  private Path getInitialTrans(LanguageLibFactory factory) throws FileNotFoundException, IOException {
//    LanguageLib langLib = factory.createLanguageLibrary();
//    if (initialTrans != null && FileCommands.exists(initialTrans))
//      return initialTrans;
//    
//    ModuleKeyCache<Path> cache = null;
//    try {
//      Path strCachePath = environment.createCachePath("strCaches");
//      @SuppressWarnings("unchecked")
//      Map<String, ModuleKeyCache<Path>> strCaches = (Map<String, ModuleKeyCache<Path>>) new ObjectInputStream(new FileInputStream(strCachePath.getFile())).readObject();
//      if (strCaches == null)
//        strCaches = new HashMap<String, ModuleKeyCache<Path>>();
//      cache = strCaches.get(langLib.getLanguageName() + "#" + langLib.getVersion());
//    } catch (Exception e) {
//    }
//    
//    if (cache == null)
//      cache = new ModuleKeyCache<Path>(new Object());
//
//    try {
//      initialTrans = STRCommands.compile(
//          new AbsolutePath(langLib.getInitTrans().getPath()),
//          "main",
//          new LinkedList<Path>(),
//          new SGLR(new TreeBuilder(), ATermCommands.parseTableManager.loadFromFile(StdLib.strategoTbl.getPath())),
//          org.strategoxt.strj.strj.init(), 
//          new ModuleKeyCache<Path>(new Object()), 
//          environment, 
//          langLib);
//    } catch (Exception e) {
//      throw new RuntimeException(e);
//    }
//    return initialTrans;
//  }
}
