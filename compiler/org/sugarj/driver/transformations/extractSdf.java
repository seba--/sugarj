package org.sugarj.driver.transformations;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class extractSdf  
{ 
  protected static final boolean TRACES_ENABLED = true;

  protected static ITermFactory constantFactory;

  private static WeakReference<Context> initedContext;

  private static boolean isIniting;

  protected static IStrategoTerm constempty_grammar0;

  protected static IStrategoTerm constNil0;

  public static IStrategoConstructor _consConc_2;

  public static IStrategoConstructor _consNone_0;

  public static IStrategoConstructor _consSome_1;

  public static IStrategoConstructor _consgrammar_elem_1;

  public static IStrategoConstructor _constransformation_elem_1;

  public static IStrategoConstructor _consDesugarings_1;

  public static IStrategoConstructor _consPureDesugaring_1;

  public static IStrategoConstructor _consInjectDesugaring_4;

  public static IStrategoConstructor _consempty_grammar_0;

  public static IStrategoConstructor _consconc_grammars_2;

  public static IStrategoConstructor _conscontext_free_syntax_1;

  public static IStrategoConstructor _consprod_3;

  public static Context init(Context context)
  { 
    synchronized(extractSdf.class)
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
          context.registerComponent("extractSdf");
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
        result = context.invokeStrategyCLI(main$S$D$F_0_0.instance, "extractSdf", args);
      }
      finally
      { 
        context.getIOAgent().closeAllFiles();
      }
      if(result == null)
      { 
        System.err.println("extractSdf" + (TRACES_ENABLED ? ": rewriting failed, trace:" : ": rewriting failed"));
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
      return context.invokeStrategyCLI(main$S$D$F_0_0.instance, "extractSdf", args);
    }
    finally
    { 
      context.getIOAgent().closeAllFiles();
    }
  }

  public static Strategy getMainStrategy()
  { 
    return main$S$D$F_0_0.instance;
  }

  public static void initConstructors(ITermFactory termFactory)
  { 
    _consConc_2 = termFactory.makeConstructor("Conc", 2);
    _consNone_0 = termFactory.makeConstructor("None", 0);
    _consSome_1 = termFactory.makeConstructor("Some", 1);
    _consgrammar_elem_1 = termFactory.makeConstructor("grammar-elem", 1);
    _constransformation_elem_1 = termFactory.makeConstructor("transformation-elem", 1);
    _consDesugarings_1 = termFactory.makeConstructor("Desugarings", 1);
    _consPureDesugaring_1 = termFactory.makeConstructor("PureDesugaring", 1);
    _consInjectDesugaring_4 = termFactory.makeConstructor("InjectDesugaring", 4);
    _consempty_grammar_0 = termFactory.makeConstructor("empty-grammar", 0);
    _consconc_grammars_2 = termFactory.makeConstructor("conc-grammars", 2);
    _conscontext_free_syntax_1 = termFactory.makeConstructor("context-free-syntax", 1);
    _consprod_3 = termFactory.makeConstructor("prod", 3);
  }

  public static void initConstants(ITermFactory termFactory)
  { 
    constNil0 = (IStrategoTerm)termFactory.makeList();
    constempty_grammar0 = termFactory.makeAppl(extractSdf._consempty_grammar_0, NO_TERMS);
  }

  @SuppressWarnings("all") public static class $Accept$S$D$F_0_0 extends Strategy 
  { 
    public static $Accept$S$D$F_0_0 instance = new $Accept$S$D$F_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail0:
      { 
        IStrategoTerm s_14 = null;
        if(term.getTermType() != IStrategoTerm.APPL || extractSdf._consgrammar_elem_1 != ((IStrategoAppl)term).getConstructor())
          break Fail0;
        s_14 = term.getSubterm(0);
        term = s_14;
        if(true)
          return term;
      }
      context.push("AcceptSDF_0_0");
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class $Accept$S$T$R_0_0 extends Strategy 
  { 
    public static $Accept$S$T$R_0_0 instance = new $Accept$S$T$R_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail1:
      { 
        IStrategoTerm t_14 = null;
        if(term.getTermType() != IStrategoTerm.APPL || extractSdf._constransformation_elem_1 != ((IStrategoAppl)term).getConstructor())
          break Fail1;
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
      Fail2:
      { 
        term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)extractSdf.constNil0);
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
      Fail3:
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
      Fail4:
      { 
        IStrategoTerm term0 = term;
        Success0:
        { 
          Fail5:
          { 
            term = c_15.invoke(context, term);
            if(term == null)
              break Fail5;
            if(true)
              break Success0;
          }
          term = children_0_0.instance.invoke(context, term0);
          if(term == null)
            break Fail4;
          lifted0 lifted00 = new lifted0();
          lifted00.c_15 = c_15;
          term = map_1_0.instance.invoke(context, term, lifted00);
          if(term == null)
            break Fail4;
          term = concat_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4;
        }
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class $Comp$Desugarings$To$S$D$F_0_0 extends Strategy 
  { 
    public static $Comp$Desugarings$To$S$D$F_0_0 instance = new $Comp$Desugarings$To$S$D$F_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("CompDesugaringsToSDF_0_0");
      Fail6:
      { 
        IStrategoTerm f_15 = null;
        if(term.getTermType() != IStrategoTerm.APPL || extractSdf._consDesugarings_1 != ((IStrategoAppl)term).getConstructor())
          break Fail6;
        f_15 = term.getSubterm(0);
        term = map_1_0.instance.invoke(context, f_15, $Comp$Desugaring$To$S$D$F_0_0.instance);
        if(term == null)
          break Fail6;
        term = concat_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail6;
        term = termFactory.makeAppl(extractSdf._conscontext_free_syntax_1, new IStrategoTerm[]{term});
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class $Comp$Desugaring$To$S$D$F_0_0 extends Strategy 
  { 
    public static $Comp$Desugaring$To$S$D$F_0_0 instance = new $Comp$Desugaring$To$S$D$F_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail7:
      { 
        IStrategoTerm term1 = term;
        IStrategoConstructor cons1 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success1:
        { 
          if(cons1 == extractSdf._consPureDesugaring_1)
          { 
            Fail8:
            { 
              term = extractSdf.constNil0;
              if(true)
                break Success1;
            }
            term = term1;
          }
          if(cons1 == extractSdf._consInjectDesugaring_4)
          { 
            IStrategoTerm j_15 = null;
            IStrategoTerm k_15 = null;
            IStrategoTerm l_15 = null;
            j_15 = term.getSubterm(1);
            k_15 = term.getSubterm(2);
            l_15 = term.getSubterm(3);
            term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(extractSdf._consprod_3, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(j_15, (IStrategoList)extractSdf.constNil0), k_15, l_15}), (IStrategoList)extractSdf.constNil0);
          }
          else
          { 
            break Fail7;
          }
        }
        if(true)
          return term;
      }
      context.push("CompDesugaringToSDF_0_0");
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class fold_conc_grammars_0_0 extends Strategy 
  { 
    public static fold_conc_grammars_0_0 instance = new fold_conc_grammars_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("fold_conc_grammars_0_0");
      Fail9:
      { 
        IStrategoTerm term2 = term;
        Success2:
        { 
          Fail10:
          { 
            if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
              break Fail10;
            term = extractSdf.constempty_grammar0;
            if(true)
              break Success2;
          }
          term = term2;
          IStrategoTerm term3 = term;
          Success3:
          { 
            Fail11:
            { 
              IStrategoTerm p_15 = null;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail11;
              p_15 = ((IStrategoList)term).head();
              IStrategoTerm arg1 = ((IStrategoList)term).tail();
              if(arg1.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg1).isEmpty())
                break Fail11;
              term = p_15;
              if(true)
                break Success3;
            }
            term = term3;
            IStrategoTerm m_15 = null;
            IStrategoTerm n_15 = null;
            IStrategoTerm o_15 = null;
            if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
              break Fail9;
            m_15 = ((IStrategoList)term).head();
            IStrategoTerm arg2 = ((IStrategoList)term).tail();
            if(arg2.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg2).isEmpty())
              break Fail9;
            n_15 = ((IStrategoList)arg2).head();
            o_15 = ((IStrategoList)arg2).tail();
            IStrategoList list0;
            list0 = checkListTail(o_15);
            if(list0 == null)
              break Fail9;
            term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(extractSdf._consconc_grammars_2, new IStrategoTerm[]{m_15, n_15}), list0);
            term = this.invoke(context, term);
            if(term == null)
              break Fail9;
          }
        }
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class main$S$D$F_0_0 extends Strategy 
  { 
    public static main$S$D$F_0_0 instance = new main$S$D$F_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("mainSDF_0_0");
      Fail12:
      { 
        term = io_wrap_1_0.instance.invoke(context, term, lifted2.instance);
        if(term == null)
          break Fail12;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class to$S$D$F_0_0 extends Strategy 
  { 
    public static to$S$D$F_0_0 instance = new to$S$D$F_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("toSDF_0_0");
      Fail13:
      { 
        term = map_1_0.instance.invoke(context, term, lifted3.instance);
        if(term == null)
          break Fail13;
        term = concat_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail13;
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
      Fail14:
      { 
        term = main$S$D$F_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail14;
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
      Fail15:
      { 
        term = extract_1_0.instance.invoke(context, term, lifted4.instance);
        if(term == null)
          break Fail15;
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
      Fail16:
      { 
        IStrategoTerm term4 = term;
        Success4:
        { 
          Fail17:
          { 
            term = $Accept$S$D$F_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail17;
            if(true)
              break Success4;
          }
          term = $Accept$S$T$R_0_0.instance.invoke(context, term4);
          if(term == null)
            break Fail16;
          term = $Comp$Desugarings$To$S$D$F_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail16;
        }
        term = singleton_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail16;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted2 extends Strategy 
  { 
    public static final lifted2 instance = new lifted2();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail18:
      { 
        term = to$S$D$F_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail18;
        term = fold_conc_grammars_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail18;
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
      Fail19:
      { 
        term = extract_1_0.instance.invoke(context, term, c_15);
        if(term == null)
          break Fail19;
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
      compiledContext.registerComponent("extractSdf");
      extractSdf.init(compiledContext);
      varScope.addSVar("AcceptSDF_0_0", new InteropSDefT($Accept$S$D$F_0_0.instance, context));
      varScope.addSVar("AcceptSTR_0_0", new InteropSDefT($Accept$S$T$R_0_0.instance, context));
      varScope.addSVar("singleton_0_0", new InteropSDefT(singleton_0_0.instance, context));
      varScope.addSVar("children_0_0", new InteropSDefT(children_0_0.instance, context));
      varScope.addSVar("extract_1_0", new InteropSDefT(extract_1_0.instance, context));
      varScope.addSVar("CompDesugaringsToSDF_0_0", new InteropSDefT($Comp$Desugarings$To$S$D$F_0_0.instance, context));
      varScope.addSVar("CompDesugaringToSDF_0_0", new InteropSDefT($Comp$Desugaring$To$S$D$F_0_0.instance, context));
      varScope.addSVar("fold_conc_grammars_0_0", new InteropSDefT(fold_conc_grammars_0_0.instance, context));
      varScope.addSVar("mainSDF_0_0", new InteropSDefT(main$S$D$F_0_0.instance, context));
      varScope.addSVar("toSDF_0_0", new InteropSDefT(to$S$D$F_0_0.instance, context));
      varScope.addSVar("main_0_0", new InteropSDefT(main_0_0.instance, context));
    }

    private void registerLazy(org.spoofax.interpreter.core.IContext context, Context compiledContext, ClassLoader classLoader, org.spoofax.interpreter.core.VarScope varScope)
    { 
      compiledContext.registerComponent("extractSdf");
      extractSdf.init(compiledContext);
      varScope.addSVar("AcceptSDF_0_0", new InteropSDefT(classLoader, "extractSdf$$Accept$S$D$F_0_0", context));
      varScope.addSVar("AcceptSTR_0_0", new InteropSDefT(classLoader, "extractSdf$$Accept$S$T$R_0_0", context));
      varScope.addSVar("singleton_0_0", new InteropSDefT(classLoader, "extractSdf$singleton_0_0", context));
      varScope.addSVar("children_0_0", new InteropSDefT(classLoader, "extractSdf$children_0_0", context));
      varScope.addSVar("extract_1_0", new InteropSDefT(classLoader, "extractSdf$extract_1_0", context));
      varScope.addSVar("CompDesugaringsToSDF_0_0", new InteropSDefT(classLoader, "extractSdf$$Comp$Desugarings$To$S$D$F_0_0", context));
      varScope.addSVar("CompDesugaringToSDF_0_0", new InteropSDefT(classLoader, "extractSdf$$Comp$Desugaring$To$S$D$F_0_0", context));
      varScope.addSVar("fold_conc_grammars_0_0", new InteropSDefT(classLoader, "extractSdf$fold_conc_grammars_0_0", context));
      varScope.addSVar("mainSDF_0_0", new InteropSDefT(classLoader, "extractSdf$main$S$D$F_0_0", context));
      varScope.addSVar("toSDF_0_0", new InteropSDefT(classLoader, "extractSdf$to$S$D$F_0_0", context));
      varScope.addSVar("main_0_0", new InteropSDefT(classLoader, "extractSdf$main_0_0", context));
    }
  }
}