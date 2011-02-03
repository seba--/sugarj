package org.sugarj.driver;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.spoofax.interpreter.terms.IStrategoConstructor;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.StrategoExit;
import org.strategoxt.lang.Strategy;
import org.strategoxt.stratego_lib.io_wrap_1_0;

@SuppressWarnings("all") public class StrategyInvoker  
{ 
  private static Strategy strategy;
  private static boolean iowrap;
  
  private static final boolean TRACES_ENABLED = true;

  private static ITermFactory constantFactory;

  private static WeakReference<Context> initedContext;

  private static boolean isIniting;

  private static IStrategoConstructor _consConc_2;

  private static IStrategoConstructor _consNone_0;

  private static IStrategoConstructor _consSome_1;

  private static Context init(Context context)
  { 
    synchronized(StrategyInvoker.class)
    { 
      if(isIniting)
        return null;
      try
      { 
        isIniting = true;
        ITermFactory termFactory = context.getFactory();
        if(constantFactory == null)
        { 
          initConstructors(termFactory);
          initConstants(termFactory);
        }
        if(initedContext == null || initedContext.get() != context)
        { 
          org.strategoxt.stratego_lib.Main.init(context);
          org.strategoxt.stratego_lib.Main.init(context);
          context.registerComponent("StrategyInvoker");
        }
        initedContext = new WeakReference<Context>(context);
        constantFactory = termFactory;
      }
      finally
      { 
        isIniting = false;
      }
      return context;
    }
  }

  private static Context init()
  { 
    return init(new Context());
  }
  
  public static IStrategoTerm invoke(Strategy strategy, boolean silent, String ... args) throws StrategoExit {
    return invoke(strategy, false, silent, args);
  }

  /**
   * Invokes the given strategy on the given command line arguments args.
   * 
   * If iowrap is true, the invoked strategy is first io-wrapped.  
   * 
   * 
   * @param strategy
   * @param iowrap
   * @param args
   * @return
   * @throws StrategoExit
   */
  public static IStrategoTerm invoke(Strategy strategy, boolean iowrap, boolean silent, String ... args) throws StrategoExit
  { 
    InputStream in = System.in;
    PrintStream out = System.out;
    PrintStream err = System.err;
    
    StringBuffer errMsgBuf = new StringBuffer();
    
    if (silent) {
// does not work:
//      String[] newArgs = new String[args.length + 1];
//      System.arraycopy(args, 0, newArgs, 0, args.length);
//      newArgs[newArgs.length - 1] = "--silent";

      System.setIn(new InputStream() {
        @Override
        public int read() throws IOException {
          return -1;
        }
      });
      
      System.setOut(new PrintStream(new OutputStream() {
        @Override
        public void write(int arg0) throws IOException { }
      }));
      
      System.setErr(new PrintStream(new OutputStream() {
        @Override
        public void write(int b) throws IOException { }
      }));
    }
    
    StrategyInvoker.strategy = strategy;
    StrategyInvoker.iowrap = iowrap;
    
    try {
      Class mainClass = strategy.getClass().getClassLoader().loadClass(strategy.getClass().getPackage().getName() + ".Main");
      
      if (mainClass != null)
        mainClass.getMethod("init").invoke(null);
        
    } catch (ClassNotFoundException e1) {
    } catch (IllegalArgumentException e) {
    } catch (SecurityException e) {
    } catch (IllegalAccessException e) {
    } catch (InvocationTargetException e) {
    } catch (NoSuchMethodException e) {
    }
    
    Context c = new Context();
    
    try {
      Class strategyClass = strategy.getClass().getDeclaringClass();
      
      if (strategyClass != null) {
        Method m = strategyClass.getMethod("init", Context.class);
        c = (Context) m.invoke(null, c);
      }
    } catch (IllegalArgumentException e) {
    } catch (SecurityException e) {
    } catch (IllegalAccessException e) {
    } catch (InvocationTargetException e) {
    } catch (NoSuchMethodException e) {
    }
    
    int exitvalue = 0;
    IStrategoTerm term = null;
    try {
      Log.log.beginExecution(strategy.getName(), args);
      
      term = invoke(c, args);
    }
    catch (StrategoExit e) {
      exitvalue = e.getValue();
      
      if (e.getValue() != 0)
        throw new RuntimeException("Rewriting failed", e);
    }
    finally {
      String[] msg = new String[args.length + 1];
      msg[0] = strategy.getName();
      System.arraycopy(args, 0, msg, 1, args.length);
      Log.log.endExecution(exitvalue, msg);
      
      System.setIn(in);
      System.setOut(out);
      System.setErr(err);
    }
    
    
    return term;
  }

  private static IStrategoTerm invoke(Context context, String ... args) throws StrategoExit
  { 
    try
    { 
      init(context);
      return context.invokeStrategyCLI(mainStrategy.instance, "StrategyInvoker", args);
    }
    finally
    { 
      context.getIOAgent().closeAllFiles();
    }
  }

  private static void initConstructors(ITermFactory termFactory)
  { 
    _consConc_2 = termFactory.makeConstructor("Conc", 2);
    _consNone_0 = termFactory.makeConstructor("None", 0);
    _consSome_1 = termFactory.makeConstructor("Some", 1);
  }

  private static void initConstants(ITermFactory termFactory)
  { }

  @SuppressWarnings("all") public static class mainStrategy extends Strategy 
  { 
    public static mainStrategy instance = new mainStrategy();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("io_wrapper");
      Fail0:
      { 
        if (iowrap)
          term = io_wrap_1_0.instance.invoke(context, term, strategy);
        else
          term = strategy.invoke(context, term);
        
        if(term == null)
          break Fail0;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }
}