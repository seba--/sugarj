package org.sugarj;

import static org.sugarj.common.Log.log;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.eclipse.core.runtime.FileLocator;
import org.sugarj.common.Environment;
import org.sugarj.common.path.RelativePath;
import org.sugarj.driver.JavaCommands;
import org.sugarj.driver.sourcefilecontent.JavaSourceFileContent;

public class JavaLib extends LanguageLib implements Serializable {

	private static final long serialVersionUID = 1817193221140795776L;
	
	private transient File libDir;
	private transient File libTmpDir;
	
	private static JavaCommands javaCommands;
	
	
	@Override
	public List<File> getGrammars() {
		List<File> grammars = new LinkedList<File>(super.getGrammars());
		grammars.add(ensureFile("org/sugarj/languages/SugarJ.def"));
		grammars.add(ensureFile("org/sugarj/languages/Java-15.def"));
		return Collections.unmodifiableList(grammars);
	}
	
	@Override
	public File getInitGrammar() {
		return ensureFile("org/sugarj/java/init/initGrammar.sdf");
		//return ensureFile("org/sugarj/languages/SugarJ.def");
	}

	@Override
	public String getInitGrammarModule() {
		return "org/sugarj/java/init/initGrammar";
		//return "org/sugarj/languages/sugarJ";
	}

	@Override
	public File getInitTrans() {
		return ensureFile("org/sugarj/java/init/InitTrans.str");
	}
	
	@Override
	public String getInitTransModule() {
		return "org/sugarj/java/init/InitTrans";
	}

	@Override
	public File getInitEditor() {
		return ensureFile("org/sugarj/java/init/initEditor.serv");
	}

	@Override
	public String getInitEditorModule() {
		return "org/sugarj/java/init/initEditor";
	}
	
	@Override
	public File getLibraryDirectory() {
		if (libDir == null) {	// set up directories first
			String thisClassPath = "org/sugarj/JavaLib.class";
			URL thisClassURL = JavaLib.class.getClassLoader().getResource(thisClassPath);
			
			System.out.println(thisClassURL);
			
			if (thisClassURL.getProtocol().equals("bundleresource"))
			  try {
			    thisClassURL = FileLocator.resolve(thisClassURL);
			  } catch (IOException e) {
			    e.printStackTrace();
			  }
			
			String classPath = thisClassURL.getPath();
			String binPath = classPath.substring(0, classPath.length() - thisClassPath.length());
			
			libDir = new File(binPath);
		}
		
		return libDir;
	}
	
	private File getTmpLibraryDirectory() {
		if (libTmpDir == null)
			try {
				File f = File.createTempFile("org.sugarj.javalib", "");
				f.delete();
				f.mkdir();
				libTmpDir = f;
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		return libTmpDir;
	}
	
	public File ensureFile(String resource) {
		File f = new File(getLibraryDirectory().getPath() + File.separator + resource);
		
		System.out.println("javalib ensure file: " + f);
		
		if (f.exists())
			return f;

		f = new File(getTmpLibraryDirectory().getPath() + "/" + resource);
		System.out.println("f does not exist, making temp file " + f);
		f.getParentFile().mkdirs();

		try {
			InputStream in = LanguageLib.class.getClassLoader().getResourceAsStream(resource);
			if (in == null)
				return  new File(getLibraryDirectory().getPath() + File.separator + resource);

			FileOutputStream fos = new FileOutputStream(f);
			byte[] bs = new byte[256];
			while (in.read(bs) >= 0)
				fos.write(bs);
			fos.close();
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return f;
	}

	
	  public static void main(String args[]) throws URISyntaxException {
		JavaLib jl = new JavaLib();
		
		for (File file : jl.getGrammars()) 
			exists(file);


	    exists(jl.getInitGrammar());
	    exists(jl.getInitTrans());
	    exists(jl.getInitEditor());
	    exists(jl.libDir);
	  }
	  
	  private static void exists(File file) {
	    if (file.exists())
	      System.out.println(file.getPath() + " exists.");
	    else
	      System.err.println(file.getPath() + " does not exist.");
	  }

	@Override
	public ICompilerCommands getCompilerCommands() {
		// singleton pattern
		if (javaCommands == null) {
			javaCommands = new JavaCommands();
		}

		return javaCommands;
	}

	@Override
	public String getSourceFileExtension() {
		return ".java";
	}

	@Override
	public String getBinFileExtension() {
		return ".class";
	}

	@Override
	public String getSugarFileExtension() {
		return ".sugj";
	}
	

}
