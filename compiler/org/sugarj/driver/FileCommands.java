package org.sugarj.driver;

import static org.sugarj.driver.Environment.sep;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URL;
import java.util.List;

/**
 * Provides methods for doing stuff with files.
 * 
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class FileCommands {

  private final static boolean DO_DELETE = false;

  public static String newTempFile(String suffix) throws IOException {
    File f =
        File.createTempFile(
            "sugarj",
            suffix == null || suffix.isEmpty() ? suffix : "." + suffix);

    if (DO_DELETE)
      f.deleteOnExit();

    return f.getAbsolutePath();
  }

  public static void delete(String file) throws IOException {
    if (file != null)
      new File(file).delete();
  }

  public static void copyFile(String from, String to) throws IOException {
    FileInputStream fis = new FileInputStream(from);
    FileOutputStream fos = new FileOutputStream(to);
    copyFile(fis, fos);
    fis.close();
    fos.close();
  }
  
  public static void copyFile(InputStream in, OutputStream out) throws IOException {
    int len;
    byte[] b = new byte[1024];

    while ((len = in.read(b)) > 0)
      out.write(b, 0, len);
  }

  /**
   * Beware: one must not rename SDF files since the filename and
   * the module name needs to coincide. Instead generate a new
   * file which imports the other SDF file.
   * 
   * @param file
   * @param content
   * @throws IOException
   */
  public static void writeToFile(String file, String content)
      throws IOException {
    FileCommands.createFile(file);
    FileOutputStream fos = new FileOutputStream(file);
    fos.write(content.getBytes());
    fos.close();
  }

  public static void appendToFile(String file, String content)
      throws IOException {
    FileOutputStream fos = new FileOutputStream(file, true);
    fos.write(content.getBytes());
    fos.close();
  }

  // from http://snippets.dzone.com/posts/show/1335
  // Author: http://snippets.dzone.com/user/daph2001
  //
  // TODO fix legal issues
  public static String readFileAsString(String filePath) throws IOException {
    StringBuffer fileData = new StringBuffer(1000);
    BufferedReader reader = new BufferedReader(new FileReader(filePath));
    char[] buf = new char[1024];
    int numRead = 0;
    while ((numRead = reader.read(buf)) != -1) {
      fileData.append(buf, 0, numRead);
    }
    reader.close();
    return fileData.toString();
  }

  
  public static String fileName(URL url) {
    return fileName(url.getPath());
  }
  
  
  public static String fileName(URI uri) {
    return fileName(uri.getPath());
  }
  
  public static String fileName(String file_doof) {
    String file = toCygwinPath(file_doof);
    int index = file.lastIndexOf(sep);

    if (index >= 0)
      file = file.substring(index + 1);

    index = file.lastIndexOf(".");

    if (index > 0)
      file = file.substring(0, index);

    return file;
  }

  /**
   * Finds the given file in the given list of paths.
   * 
   * @param filename
   *        relative filename.
   * @param paths
   *        list of possible paths to filename
   * @return full file path to filename or null
   */
  public static String findFile(String filename, List<String> paths) {
    return findFile(filename, paths.toArray(new String[] {}));
  }

  /**
   * Finds the given file in the given list of paths.
   * 
   * @param filename
   *        relative filename.
   * @param paths
   *        list of possible paths to filename
   * @return full file path to filename or null
   */
  public static String findFile(String filename, String... paths) {
    for (String path : paths) {
      File f = new File(path + sep + filename);
      if (f.exists())
        return f.getAbsolutePath();
    }

    return null;
  }

  public static String newTempDir() throws IOException {
    File f = File.createTempFile("SugarJ", "");
    // need to delete the file, but want to reuse the filename
    f.delete();
    f.mkdir();

    // TODO add shutdownHook to recursively delete this temporary
    // directory

    return f.getAbsolutePath();
  }

  public static void prependToFile(String file, String head) throws IOException {
    File tmp = new File(newTempFile(""));
    new File(file).renameTo(tmp);

    FileInputStream in = new FileInputStream(tmp);
    FileOutputStream out = new FileOutputStream(file);

    out.write(head.getBytes());

    int len;
    byte[] b = new byte[1024];

    while ((len = in.read(b)) > 0)
      out.write(b, 0, len);

    in.close();
    out.close();
    delete(tmp.getAbsolutePath());
  }

  public static void createFile(String file) throws IOException {
    File f = new File(file);
    if (f.getParentFile().exists() || f.getParentFile().mkdirs())
      f.createNewFile();
  }

  /**
   * Create file with name deduced from hash in dir.
   * 
   * @param dir
   * @param hash
   * @return
   * @throws IOException
   */
  public static String createFile(String dir, int hash) throws IOException {
    String s = dir + sep + hashFileName("sugarj", hash);
    createFile(s);
    return s;
  }

  public static void createDir(String dir) throws IOException {
    File f = new File(dir);
    f.mkdirs();
  }

  /**
   * Create directory with name deduced from hash in dir.
   * 
   * @param dir
   * @param hash
   * @return
   * @throws IOException
   */
  public static String createDir(String dir, int hash) throws IOException {
    String s = dir + sep + hashFileName("SugarJ", hash);
    createDir(s);
    return s;
  }

  /**
   * Ensures that a path is suitable for a cygwin command line.
   */
  public static String toCygwinPath(String filepath) {
    // XXX hacky

    if (System.getProperty("os.name").toLowerCase().contains("win")) {
      filepath = filepath.replace("\\", "/");
      filepath = filepath.replace("/C:/", "/cygdrive/C/");
      filepath = filepath.replace("C:/", "/cygdrive/C/");
    }

    return filepath;
  }

  /**
   * Ensure that a path is suitable for a windows command line
   */
  public static String toWindowsPath(String filepath) {
    // XXX hacky

    if (System.getProperty("os.name").toLowerCase().contains("win")) {
      filepath = filepath.replace("/cygdrive/C", "C:");
      filepath = filepath.replace("/C:", "C:");
      filepath = filepath.replace("/", "\\");
    }

    return filepath;
  }

  /**
   * checks whether f1 was modified after f2.
   * 
   * @return true iff f1 was modified after f2.
   */
  public static boolean isModifiedLater(String f1, String f2) {
    return new File(f1).lastModified() > new File(f2).lastModified();
  }

  /**
   * Inserts string s into the given file as the given line
   * number.
   * 
   * @param s
   * @param file
   * @param line
   * @throws IOException
   */
  public static void insert(String s, String file, int line) throws IOException {
    StringBuilder b = new StringBuilder();
    BufferedReader br = new BufferedReader(new FileReader(file));

    String in;
    int i = 0;

    while ((in = br.readLine()) != null) {
      i++;
      if (i == line)
        b.append(s).append('\n');

      b.append(in).append('\n');
    }

    if (i < line)
      b.append(s);

    br.close();
    writeToFile(file, b.toString());
  }

  public static boolean exists(String file) {
    return new File(file).exists();
  }
  
  public static boolean exists(URI file) {
    return new File(file).exists();
  }

  public static String hashFileName(String prefix, int hash) {
    return prefix + (hash < 0 ? "1" + Math.abs(hash) : "0" + hash);
  }

  public static String hashFileName(String prefix, Object o) {
    return hashFileName(prefix, o.hashCode());
  }

  public static String getExtension(File infile) {
    int i = infile.getName().lastIndexOf('.');
    
    if (i > 0)
      return infile.getName().substring(i+1, infile.getName().length());
    
    return null;
  }
  
  public static String dropExtension(String file) {
    int i = file.lastIndexOf('.');
    
    if (i > 0)
      return file.substring(0, i);
    
    return file;
  }

  public static void trimQuotes(String file) throws IOException {
    String s = readFileAsString(file);
    s = s.trim();
    
    Log.log.log("trim: " + s);
    
    if (s.startsWith("\"") && s.endsWith("\"")) {
      s = s.substring(1, s.length() - 1);
      writeToFile(file, s);
    }
  }

  public static String getRelativeModulePath(String module) {
    return module.replace(".", sep);
  }

  public static int fileHash(String file) throws IOException {
    if (exists(file))
      return readFileAsString(file).hashCode();
    
    return 0;
  }
}
