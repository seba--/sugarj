package org.sugarj.driver.transformations;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class extractStr  
{ 
  protected static final boolean TRACES_ENABLED = true;

  protected static ITermFactory constantFactory;

  private static WeakReference<Context> initedContext;

  private static boolean isIniting;

  protected static IStrategoTerm constCallNoArgs0;

  protected static IStrategoTerm constSVar0;

  protected static IStrategoTerm const1;

  protected static IStrategoTerm const0;

  protected static IStrategoTerm constNil0;

  public static IStrategoConstructor _consConc_2;

  public static IStrategoConstructor _consNone_0;

  public static IStrategoConstructor _consSome_1;

  public static IStrategoConstructor _constransformation_elem_1;

  public static IStrategoConstructor _consDesugarings_1;

  public static IStrategoConstructor _consPureDesugaring_1;

  public static IStrategoConstructor _consInjectDesugaring_4;

  public static IStrategoConstructor _consSVar_1;

  public static IStrategoConstructor _consCall_2;

  public static IStrategoConstructor _consCallNoArgs_1;

  public static IStrategoConstructor _consSDefNoArgs_2;

  public static IStrategoConstructor _consStrategies_1;

  public static Context init(Context context)
  { 
    synchronized(extractStr.class)
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
          context.registerComponent("extractStr");
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

  public static Context init()
  { 
    return init(new Context());
  }

  public static void main(String args[])
  { 
    Context context = init();
    context.setStandAlone(true);
    try
    { 
      IStrategoTerm result;
      try
      { 
        result = context.invokeStrategyCLI(main$S$T$R_0_0.instance, "extractStr", args);
      }
      finally
      { 
        context.getIOAgent().closeAllFiles();
      }
      if(result == null)
      { 
        System.err.println("extractStr" + (TRACES_ENABLED ? ": rewriting failed, trace:" : ": rewriting failed"));
        context.printStackTrace();
        context.setStandAlone(false);
        System.exit(1);
      }
      else
      { 
        System.out.println(result);
        context.setStandAlone(false);
        System.exit(0);
      }
    }
    catch(StrategoExit exit)
    { 
      context.setStandAlone(false);
      System.exit(exit.getValue());
    }
  }

  public static IStrategoTerm mainNoExit(String ... args) throws StrategoExit
  { 
    return mainNoExit(new Context(), args);
  }

  public static IStrategoTerm mainNoExit(Context context, String ... args) throws StrategoExit
  { 
    try
    { 
      init(context);
      return context.invokeStrategyCLI(main$S$T$R_0_0.instance, "extractStr", args);
    }
    finally
    { 
      context.getIOAgent().closeAllFiles();
    }
  }

  public static Strategy getMainStrategy()
  { 
    return main$S$T$R_0_0.instance;
  }

  public static void initConstructors(ITermFactory termFactory)
  { 
    _consConc_2 = termFactory.makeConstructor("Conc", 2);
    _consNone_0 = termFactory.makeConstructor("None", 0);
    _consSome_1 = termFactory.makeConstructor("Some", 1);
    _constransformation_elem_1 = termFactory.makeConstructor("transformation-elem", 1);
    _consDesugarings_1 = termFactory.makeConstructor("Desugarings", 1);
    _consPureDesugaring_1 = termFactory.makeConstructor("PureDesugaring", 1);
    _consInjectDesugaring_4 = termFactory.makeConstructor("InjectDesugaring", 4);
    _consSVar_1 = termFactory.makeConstructor("SVar", 1);
    _consCall_2 = termFactory.makeConstructor("Call", 2);
    _consCallNoArgs_1 = termFactory.makeConstructor("CallNoArgs", 1);
    _consSDefNoArgs_2 = termFactory.makeConstructor("SDefNoArgs", 2);
    _consStrategies_1 = termFactory.makeConstructor("Strategies", 1);
  }

  public static void initConstants(ITermFactory termFactory)
  { 
    constNil0 = (IStrategoTerm)termFactory.makeList();
    const0 = termFactory.makeString("desugar");
    const1 = termFactory.makeString("changed-tree");
    constSVar0 = termFactory.makeAppl(extractStr._consSVar_1, new IStrategoTerm[]{extractStr.const1});
    constCallNoArgs0 = termFactory.makeAppl(extractStr._consCallNoArgs_1, new IStrategoTerm[]{extractStr.constSVar0});
  }

  @SuppressWarnings("all") public static class $Accept$S$T$R_0_0 extends Strategy 
  { 
    public static $Accept$S$T$R_0_0 instance = new $Accept$S$T$R_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail0:
      { 
        IStrategoTerm t_14 = null;
        if(term.getTermType() != IStrategoTerm.APPL || extractStr._constransformation_elem_1 != ((IStrategoAppl)term).getConstructor())
          break Fail0;
        t_14 = term.getSubterm(0);
        term = t_14;
        if(true)
          return term;
      }
      context.push("AcceptSTR_0_0");
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class singleton_0_0 extends Strategy 
  { 
    public static singleton_0_0 instance = new singleton_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail1:
      { 
        term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)extractStr.constNil0);
        if(true)
          return term;
      }
      context.push("singleton_0_0");
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class children_0_0 extends Strategy 
  { 
    public static children_0_0 instance = new children_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail2:
      { 
        IStrategoTerm args0 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{term});
        term = args0;
        if(true)
          return term;
      }
      context.push("children_0_0");
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class extract_1_0 extends Strategy 
  { 
    public static extract_1_0 instance = new extract_1_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_15)
    { 
      context.push("extract_1_0");
      Fail3:
      { 
        IStrategoTerm term0 = term;
        Success0:
        { 
          Fail4:
          { 
            term = c_15.invoke(context, term);
            if(term == null)
              break Fail4;
            if(true)
              break Success0;
          }
          term = children_0_0.instance.invoke(context, term0);
          if(term == null)
            break Fail3;
          lifted0 lifted00 = new lifted0();
          lifted00.c_15 = c_15;
          term = map_1_0.instance.invoke(context, term, lifted00);
          if(term == null)
            break Fail3;
          term = concat_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail3;
        }
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class $Comp$Desugarings$To$S$T$R_0_0 extends Strategy 
  { 
    public static $Comp$Desugarings$To$S$T$R_0_0 instance = new $Comp$Desugarings$To$S$T$R_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("CompDesugaringsToSTR_0_0");
      Fail5:
      { 
        IStrategoTerm q_15 = null;
        if(term.getTermType() != IStrategoTerm.APPL || extractStr._consDesugarings_1 != ((IStrategoAppl)term).getConstructor())
          break Fail5;
        q_15 = term.getSubterm(0);
        term = map_1_0.instance.invoke(context, q_15, $Comp$Desugaring$To$S$T$R_0_0.instance);
        if(term == null)
          break Fail5;
        term = termFactory.makeAppl(extractStr._consStrategies_1, new IStrategoTerm[]{term});
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class $Comp$Desugaring$To$S$T$R_0_0 extends Strategy 
  { 
    public static $Comp$Desugaring$To$S$T$R_0_0 instance = new $Comp$Desugaring$To$S$T$R_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail6:
      { 
        IStrategoTerm term1 = term;
        IStrategoConstructor cons1 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success1:
        { 
          if(cons1 == extractStr._consPureDesugaring_1)
          { 
            Fail7:
            { 
              IStrategoTerm x_15 = null;
              x_15 = term.getSubterm(0);
              term = termFactory.makeAppl(extractStr._consSDefNoArgs_2, new IStrategoTerm[]{extractStr.const0, termFactory.makeAppl(extractStr._consCall_2, new IStrategoTerm[]{extractStr.constCallNoArgs0, (IStrategoTerm)termFactory.makeListCons(x_15, (IStrategoList)extractStr.constNil0)})});
              if(true)
                break Success1;
            }
            term = term1;
          }
          if(cons1 == extractStr._consInjectDesugaring_4)
          { 
            IStrategoTerm w_15 = null;
            w_15 = term.getSubterm(0);
            term = termFactory.makeAppl(extractStr._consSDefNoArgs_2, new IStrategoTerm[]{extractStr.const0, termFactory.makeAppl(extractStr._consCall_2, new IStrategoTerm[]{extractStr.constCallNoArgs0, (IStrategoTerm)termFactory.makeListCons(w_15, (IStrategoList)extractStr.constNil0)})});
          }
          else
          { 
            break Fail6;
          }
        }
        if(true)
          return term;
      }
      context.push("CompDesugaringToSTR_0_0");
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class main$S$T$R_0_0 extends Strategy 
  { 
    public static main$S$T$R_0_0 instance = new main$S$T$R_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("mainSTR_0_0");
      Fail8:
      { 
        term = io_wrap_1_0.instance.invoke(context, term, to$S$T$R_0_0.instance);
        if(term == null)
          break Fail8;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class to$S$T$R_0_0 extends Strategy 
  { 
    public static to$S$T$R_0_0 instance = new to$S$T$R_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("toSTR_0_0");
      Fail9:
      { 
        term = map_1_0.instance.invoke(context, term, lifted3.instance);
        if(term == null)
          break Fail9;
        term = concat_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail9;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class main_0_0 extends Strategy 
  { 
    public static main_0_0 instance = new main_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("main_0_0");
      Fail10:
      { 
        term = main$S$T$R_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail10;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted3 extends Strategy 
  { 
    public static final lifted3 instance = new lifted3();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail11:
      { 
        term = extract_1_0.instance.invoke(context, term, lifted4.instance);
        if(term == null)
          break Fail11;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted4 extends Strategy 
  { 
    public static final lifted4 instance = new lifted4();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail12:
      { 
        term = $Accept$S$T$R_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail12;
        term = try_1_0.instance.invoke(context, term, $Comp$Desugarings$To$S$T$R_0_0.instance);
        if(term == null)
          break Fail12;
        term = singleton_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail12;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted0 extends Strategy 
  { 
    Strategy c_15;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail13:
      { 
        term = extract_1_0.instance.invoke(context, term, c_15);
        if(term == null)
          break Fail13;
        if(true)
          return term;
      }
      return null;
    }
  }

  public static void registerInterop(org.spoofax.interpreter.core.IContext context, Context compiledContext)
  { 
    new InteropRegisterer().registerLazy(context, compiledContext, InteropRegisterer.class.getClassLoader());
  }

  @SuppressWarnings("unused") public static class InteropRegisterer extends org.strategoxt.lang.InteropRegisterer 
  { 
    @Override public void register(org.spoofax.interpreter.core.IContext context, Context compiledContext)
    { 
      register(context, compiledContext, context.getVarScope());
    }

    @Override public void registerLazy(org.spoofax.interpreter.core.IContext context, Context compiledContext, ClassLoader classLoader)
    { 
      registerLazy(context, compiledContext, classLoader, context.getVarScope());
    }

    private void register(org.spoofax.interpreter.core.IContext context, Context compiledContext, org.spoofax.interpreter.core.VarScope varScope)
    { 
      compiledContext.registerComponent("extractStr");
      extractStr.init(compiledContext);
      varScope.addSVar("AcceptSTR_0_0", new InteropSDefT($Accept$S$T$R_0_0.instance, context));
      varScope.addSVar("singleton_0_0", new InteropSDefT(singleton_0_0.instance, context));
      varScope.addSVar("children_0_0", new InteropSDefT(children_0_0.instance, context));
      varScope.addSVar("extract_1_0", new InteropSDefT(extract_1_0.instance, context));
      varScope.addSVar("CompDesugaringsToSTR_0_0", new InteropSDefT($Comp$Desugarings$To$S$T$R_0_0.instance, context));
      varScope.addSVar("CompDesugaringToSTR_0_0", new InteropSDefT($Comp$Desugaring$To$S$T$R_0_0.instance, context));
      varScope.addSVar("mainSTR_0_0", new InteropSDefT(main$S$T$R_0_0.instance, context));
      varScope.addSVar("toSTR_0_0", new InteropSDefT(to$S$T$R_0_0.instance, context));
      varScope.addSVar("main_0_0", new InteropSDefT(main_0_0.instance, context));
    }

    private void registerLazy(org.spoofax.interpreter.core.IContext context, Context compiledContext, ClassLoader classLoader, org.spoofax.interpreter.core.VarScope varScope)
    { 
      compiledContext.registerComponent("extractStr");
      extractStr.init(compiledContext);
      varScope.addSVar("AcceptSTR_0_0", new InteropSDefT(classLoader, "extractStr$$Accept$S$T$R_0_0", context));
      varScope.addSVar("singleton_0_0", new InteropSDefT(classLoader, "extractStr$singleton_0_0", context));
      varScope.addSVar("children_0_0", new InteropSDefT(classLoader, "extractStr$children_0_0", context));
      varScope.addSVar("extract_1_0", new InteropSDefT(classLoader, "extractStr$extract_1_0", context));
      varScope.addSVar("CompDesugaringsToSTR_0_0", new InteropSDefT(classLoader, "extractStr$$Comp$Desugarings$To$S$T$R_0_0", context));
      varScope.addSVar("CompDesugaringToSTR_0_0", new InteropSDefT(classLoader, "extractStr$$Comp$Desugaring$To$S$T$R_0_0", context));
      varScope.addSVar("mainSTR_0_0", new InteropSDefT(classLoader, "extractStr$main$S$T$R_0_0", context));
      varScope.addSVar("toSTR_0_0", new InteropSDefT(classLoader, "extractStr$to$S$T$R_0_0", context));
      varScope.addSVar("main_0_0", new InteropSDefT(classLoader, "extractStr$main_0_0", context));
    }
  }
}