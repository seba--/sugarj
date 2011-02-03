package org.sugarj.driver.transformations;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class sdf_desugar  
{ 
  protected static final boolean TRACES_ENABLED = true;

  protected static ITermFactory constantFactory;

  private static WeakReference<Context> initedContext;

  private static boolean isIniting;

  protected static IStrategoTerm constattrs0;

  protected static IStrategoTerm constNil0;

  public static IStrategoConstructor _consConc_2;

  public static IStrategoConstructor _consNone_0;

  public static IStrategoConstructor _consSome_1;

  public static IStrategoConstructor _consnatural_1;

  public static IStrategoConstructor _consint_1;

  public static IStrategoConstructor _consfun_1;

  public static IStrategoConstructor _consappl_2;

  public static IStrategoConstructor _consannotated_2;

  public static IStrategoConstructor _consterm_1;

  public static IStrategoConstructor _consattrs_1;

  public static IStrategoConstructor _consno_attrs_0;

  public static IStrategoConstructor _conslit_1;

  public static IStrategoConstructor _consci_lit_1;

  public static IStrategoConstructor _consdefault_1;

  public static IStrategoConstructor _consquoted_1;

  public static IStrategoConstructor _consunquoted_1;

  public static IStrategoConstructor _conslist_1;

  public static Context init(Context context)
  { 
    synchronized(sdf_desugar.class)
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
          context.registerComponent("sdf_desugar");
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
        result = context.invokeStrategyCLI(sdf_desugar_0_0.instance, "sdf_desugar", args);
      }
      finally
      { 
        context.getIOAgent().closeAllFiles();
      }
      if(result == null)
      { 
        System.err.println("sdf_desugar" + (TRACES_ENABLED ? ": rewriting failed, trace:" : ": rewriting failed"));
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
      return context.invokeStrategyCLI(sdf_desugar_0_0.instance, "sdf_desugar", args);
    }
    finally
    { 
      context.getIOAgent().closeAllFiles();
    }
  }

  public static Strategy getMainStrategy()
  { 
    return sdf_desugar_0_0.instance;
  }

  public static void initConstructors(ITermFactory termFactory)
  { 
    _consConc_2 = termFactory.makeConstructor("Conc", 2);
    _consNone_0 = termFactory.makeConstructor("None", 0);
    _consSome_1 = termFactory.makeConstructor("Some", 1);
    _consnatural_1 = termFactory.makeConstructor("natural", 1);
    _consint_1 = termFactory.makeConstructor("int", 1);
    _consfun_1 = termFactory.makeConstructor("fun", 1);
    _consappl_2 = termFactory.makeConstructor("appl", 2);
    _consannotated_2 = termFactory.makeConstructor("annotated", 2);
    _consterm_1 = termFactory.makeConstructor("term", 1);
    _consattrs_1 = termFactory.makeConstructor("attrs", 1);
    _consno_attrs_0 = termFactory.makeConstructor("no-attrs", 0);
    _conslit_1 = termFactory.makeConstructor("lit", 1);
    _consci_lit_1 = termFactory.makeConstructor("ci-lit", 1);
    _consdefault_1 = termFactory.makeConstructor("default", 1);
    _consquoted_1 = termFactory.makeConstructor("quoted", 1);
    _consunquoted_1 = termFactory.makeConstructor("unquoted", 1);
    _conslist_1 = termFactory.makeConstructor("list", 1);
  }

  public static void initConstants(ITermFactory termFactory)
  { 
    constNil0 = (IStrategoTerm)termFactory.makeList();
    constattrs0 = termFactory.makeAppl(sdf_desugar._consattrs_1, new IStrategoTerm[]{sdf_desugar.constNil0});
  }

  @SuppressWarnings("all") public static class sdf_desugar_0_0 extends Strategy 
  { 
    public static sdf_desugar_0_0 instance = new sdf_desugar_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("sdf_desugar_0_0");
      Fail0:
      { 
        term = io_wrap_1_0.instance.invoke(context, term, lifted0.instance);
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

  @SuppressWarnings("all") public static class $Sdf$Desugar_0_0 extends Strategy 
  { 
    public static $Sdf$Desugar_0_0 instance = new $Sdf$Desugar_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail1:
      { 
        IStrategoTerm term0 = term;
        IStrategoConstructor cons0 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success0:
        { 
          if(cons0 == sdf_desugar._consno_attrs_0)
          { 
            Fail2:
            { 
              term = sdf_desugar.constattrs0;
              if(true)
                break Success0;
            }
            term = term0;
          }
          if(cons0 == sdf_desugar._consterm_1)
          { 
            IStrategoTerm x_4 = null;
            IStrategoTerm arg0 = term.getSubterm(0);
            if(arg0.getTermType() != IStrategoTerm.APPL || sdf_desugar._consdefault_1 != ((IStrategoAppl)arg0).getConstructor())
              break Fail1;
            x_4 = arg0.getSubterm(0);
            term = termFactory.makeAppl(sdf_desugar._consterm_1, new IStrategoTerm[]{x_4});
          }
          else
          { 
            break Fail1;
          }
        }
        if(true)
          return term;
      }
      context.push("SdfDesugar_0_0");
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class $Sdf$Desugar$Once_0_0 extends Strategy 
  { 
    public static $Sdf$Desugar$Once_0_0 instance = new $Sdf$Desugar$Once_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("SdfDesugarOnce_0_0");
      Fail3:
      { 
        IStrategoTerm term1 = term;
        Success1:
        { 
          Fail4:
          { 
            term = alltd_1_0.instance.invoke(context, term, $Ensure$Quotes_0_0.instance);
            if(term == null)
              break Fail4;
            term = term_1_0.instance.invoke(context, term, implode_aterm_0_0.instance);
            if(term == null)
              break Fail4;
            if(true)
              break Success1;
          }
          term = term1;
          IStrategoTerm term2 = term;
          IStrategoConstructor cons1 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
          Success2:
          { 
            if(cons1 == sdf_desugar._conslit_1)
            { 
              Fail5:
              { 
                IStrategoTerm b_5 = null;
                b_5 = term.getSubterm(0);
                term = un_double_quote_0_0.instance.invoke(context, b_5);
                if(term == null)
                  break Fail5;
                term = termFactory.makeAppl(sdf_desugar._conslit_1, new IStrategoTerm[]{term});
                if(true)
                  break Success2;
              }
              term = term2;
            }
            if(cons1 == sdf_desugar._consci_lit_1)
            { 
              IStrategoTerm y_4 = null;
              y_4 = term.getSubterm(0);
              term = un_single_quote_0_0.instance.invoke(context, y_4);
              if(term == null)
                break Fail3;
              term = termFactory.makeAppl(sdf_desugar._consci_lit_1, new IStrategoTerm[]{term});
            }
            else
            { 
              break Fail3;
            }
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

  @SuppressWarnings("all") public static class $Ensure$Quotes_0_0 extends Strategy 
  { 
    public static $Ensure$Quotes_0_0 instance = new $Ensure$Quotes_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("EnsureQuotes_0_0");
      Fail6:
      { 
        IStrategoTerm e_5 = null;
        if(term.getTermType() != IStrategoTerm.APPL || sdf_desugar._consquoted_1 != ((IStrategoAppl)term).getConstructor())
          break Fail6;
        e_5 = term.getSubterm(0);
        IStrategoTerm term3 = term;
        Success3:
        { 
          Fail7:
          { 
            term = un_double_quote_0_0.instance.invoke(context, e_5);
            if(term == null)
              break Fail7;
            { 
              if(true)
                break Fail6;
              if(true)
                break Success3;
            }
          }
          term = term3;
        }
        term = double_quote_0_0.instance.invoke(context, e_5);
        if(term == null)
          break Fail6;
        term = termFactory.makeAppl(sdf_desugar._consquoted_1, new IStrategoTerm[]{term});
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class implode_aterm_0_0 extends Strategy 
  { 
    public static implode_aterm_0_0 instance = new implode_aterm_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("implode_aterm_0_0");
      Fail8:
      { 
        IStrategoTerm term4 = term;
        Success4:
        { 
          Fail9:
          { 
            term = aterm_implode_annotated_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail9;
            if(true)
              break Success4;
          }
          term = term4;
          IStrategoTerm term5 = term;
          Success5:
          { 
            Fail10:
            { 
              term = aterm_implode_list_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail10;
              if(true)
                break Success5;
            }
            term = term5;
            IStrategoTerm term6 = term;
            Success6:
            { 
              Fail11:
              { 
                term = aterm_implode_int_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail11;
                if(true)
                  break Success6;
              }
              term = term6;
              IStrategoTerm term7 = term;
              Success7:
              { 
                Fail12:
                { 
                  term = aterm_implode_fun_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail12;
                  if(true)
                    break Success7;
                }
                term = aterm_implode_appl_0_0.instance.invoke(context, term7);
                if(term == null)
                  break Fail8;
              }
            }
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

  @SuppressWarnings("all") public static class aterm_implode_list_0_0 extends Strategy 
  { 
    public static aterm_implode_list_0_0 instance = new aterm_implode_list_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("aterm_implode_list_0_0");
      Fail13:
      { 
        IStrategoTerm i_5 = null;
        if(term.getTermType() != IStrategoTerm.APPL || sdf_desugar._conslist_1 != ((IStrategoAppl)term).getConstructor())
          break Fail13;
        i_5 = term.getSubterm(0);
        term = map_1_0.instance.invoke(context, i_5, implode_aterm_0_0.instance);
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

  @SuppressWarnings("all") public static class aterm_implode_int_0_0 extends Strategy 
  { 
    public static aterm_implode_int_0_0 instance = new aterm_implode_int_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("aterm_implode_int_0_0");
      Fail14:
      { 
        IStrategoTerm j_5 = null;
        if(term.getTermType() != IStrategoTerm.APPL || sdf_desugar._consint_1 != ((IStrategoAppl)term).getConstructor())
          break Fail14;
        IStrategoTerm arg1 = term.getSubterm(0);
        if(arg1.getTermType() != IStrategoTerm.APPL || sdf_desugar._consnatural_1 != ((IStrategoAppl)arg1).getConstructor())
          break Fail14;
        j_5 = arg1.getSubterm(0);
        term = string_to_int_0_0.instance.invoke(context, j_5);
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

  @SuppressWarnings("all") public static class aterm_implode_fun_0_0 extends Strategy 
  { 
    public static aterm_implode_fun_0_0 instance = new aterm_implode_fun_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("aterm_implode_fun_0_0");
      Fail15:
      { 
        IStrategoTerm k_5 = null;
        IStrategoTerm l_5 = null;
        IStrategoTerm m_5 = null;
        if(term.getTermType() != IStrategoTerm.APPL || sdf_desugar._consfun_1 != ((IStrategoAppl)term).getConstructor())
          break Fail15;
        k_5 = term.getSubterm(0);
        m_5 = term;
        term = aterm_implode_afun_0_0.instance.invoke(context, k_5);
        if(term == null)
          break Fail15;
        l_5 = term;
        term = m_5;
        IStrategoTerm mkterm0;
        mkterm0 = context.invokePrimitive("SSL_mkterm", term, NO_STRATEGIES, new IStrategoTerm[]{l_5, sdf_desugar.constNil0});
        if(mkterm0 == null)
          break Fail15;
        term = mkterm0;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class aterm_implode_appl_0_0 extends Strategy 
  { 
    public static aterm_implode_appl_0_0 instance = new aterm_implode_appl_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("aterm_implode_appl_0_0");
      Fail16:
      { 
        IStrategoTerm n_5 = null;
        IStrategoTerm o_5 = null;
        IStrategoTerm p_5 = null;
        IStrategoTerm q_5 = null;
        IStrategoTerm r_5 = null;
        IStrategoTerm s_5 = null;
        if(term.getTermType() != IStrategoTerm.APPL || sdf_desugar._consappl_2 != ((IStrategoAppl)term).getConstructor())
          break Fail16;
        o_5 = term.getSubterm(0);
        n_5 = term.getSubterm(1);
        q_5 = term;
        term = aterm_implode_afun_0_0.instance.invoke(context, o_5);
        if(term == null)
          break Fail16;
        p_5 = term;
        s_5 = q_5;
        term = map_1_0.instance.invoke(context, n_5, implode_aterm_0_0.instance);
        if(term == null)
          break Fail16;
        r_5 = term;
        term = s_5;
        IStrategoTerm mkterm1;
        mkterm1 = context.invokePrimitive("SSL_mkterm", term, NO_STRATEGIES, new IStrategoTerm[]{p_5, r_5});
        if(mkterm1 == null)
          break Fail16;
        term = mkterm1;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class aterm_implode_afun_0_0 extends Strategy 
  { 
    public static aterm_implode_afun_0_0 instance = new aterm_implode_afun_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail17:
      { 
        IStrategoTerm term8 = term;
        IStrategoConstructor cons2 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success8:
        { 
          if(cons2 == sdf_desugar._consunquoted_1)
          { 
            Fail18:
            { 
              IStrategoTerm w_5 = null;
              w_5 = term.getSubterm(0);
              term = w_5;
              if(true)
                break Success8;
            }
            term = term8;
          }
          if(cons2 == sdf_desugar._consquoted_1)
          { 
            IStrategoTerm v_5 = null;
            v_5 = term.getSubterm(0);
            term = v_5;
          }
          else
          { 
            break Fail17;
          }
        }
        if(true)
          return term;
      }
      context.push("aterm_implode_afun_0_0");
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class aterm_implode_annotated_0_0 extends Strategy 
  { 
    public static aterm_implode_annotated_0_0 instance = new aterm_implode_annotated_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("aterm_implode_annotated_0_0");
      Fail19:
      { 
        IStrategoTerm x_5 = null;
        IStrategoTerm y_5 = null;
        IStrategoTerm z_5 = null;
        if(term.getTermType() != IStrategoTerm.APPL || sdf_desugar._consannotated_2 != ((IStrategoAppl)term).getConstructor())
          break Fail19;
        x_5 = term.getSubterm(0);
        IStrategoTerm arg2 = term.getSubterm(1);
        if(arg2.getTermType() != IStrategoTerm.APPL || sdf_desugar._consdefault_1 != ((IStrategoAppl)arg2).getConstructor())
          break Fail19;
        z_5 = arg2.getSubterm(0);
        term = implode_aterm_0_0.instance.invoke(context, x_5);
        if(term == null)
          break Fail19;
        y_5 = term;
        term = map_1_0.instance.invoke(context, z_5, implode_aterm_0_0.instance);
        if(term == null)
          break Fail19;
        term = termFactory.annotateTerm(y_5, checkListAnnos(termFactory, term));
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
      Fail20:
      { 
        term = sdf_desugar_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail20;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class term_1_0 extends Strategy 
  { 
    public static term_1_0 instance = new term_1_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_9)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("term_1_0");
      Fail21:
      { 
        IStrategoTerm i_91 = null;
        IStrategoTerm h_91 = null;
        if(term.getTermType() != IStrategoTerm.APPL || sdf_desugar._consterm_1 != ((IStrategoAppl)term).getConstructor())
          break Fail21;
        h_91 = term.getSubterm(0);
        IStrategoList annos0 = term.getAnnotations();
        i_91 = annos0;
        term = r_9.invoke(context, h_91);
        if(term == null)
          break Fail21;
        term = termFactory.annotateTerm(termFactory.makeAppl(sdf_desugar._consterm_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, i_91));
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted0 extends Strategy 
  { 
    public static final lifted0 instance = new lifted0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail22:
      { 
        term = topdown_1_0.instance.invoke(context, term, lifted1.instance);
        if(term == null)
          break Fail22;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted1 extends Strategy 
  { 
    public static final lifted1 instance = new lifted1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail23:
      { 
        term = repeat_1_0.instance.invoke(context, term, $Sdf$Desugar_0_0.instance);
        if(term == null)
          break Fail23;
        term = try_1_0.instance.invoke(context, term, $Sdf$Desugar$Once_0_0.instance);
        if(term == null)
          break Fail23;
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
      compiledContext.registerComponent("sdf_desugar");
      sdf_desugar.init(compiledContext);
      varScope.addSVar("sdf_desugar_0_0", new InteropSDefT(sdf_desugar_0_0.instance, context));
      varScope.addSVar("SdfDesugar_0_0", new InteropSDefT($Sdf$Desugar_0_0.instance, context));
      varScope.addSVar("SdfDesugarOnce_0_0", new InteropSDefT($Sdf$Desugar$Once_0_0.instance, context));
      varScope.addSVar("EnsureQuotes_0_0", new InteropSDefT($Ensure$Quotes_0_0.instance, context));
      varScope.addSVar("implode_aterm_0_0", new InteropSDefT(implode_aterm_0_0.instance, context));
      varScope.addSVar("aterm_implode_list_0_0", new InteropSDefT(aterm_implode_list_0_0.instance, context));
      varScope.addSVar("aterm_implode_int_0_0", new InteropSDefT(aterm_implode_int_0_0.instance, context));
      varScope.addSVar("aterm_implode_fun_0_0", new InteropSDefT(aterm_implode_fun_0_0.instance, context));
      varScope.addSVar("aterm_implode_appl_0_0", new InteropSDefT(aterm_implode_appl_0_0.instance, context));
      varScope.addSVar("aterm_implode_afun_0_0", new InteropSDefT(aterm_implode_afun_0_0.instance, context));
      varScope.addSVar("aterm_implode_annotated_0_0", new InteropSDefT(aterm_implode_annotated_0_0.instance, context));
      varScope.addSVar("main_0_0", new InteropSDefT(main_0_0.instance, context));
      varScope.addSVar("term_1_0", new InteropSDefT(term_1_0.instance, context));
    }

    private void registerLazy(org.spoofax.interpreter.core.IContext context, Context compiledContext, ClassLoader classLoader, org.spoofax.interpreter.core.VarScope varScope)
    { 
      compiledContext.registerComponent("sdf_desugar");
      sdf_desugar.init(compiledContext);
      varScope.addSVar("sdf_desugar_0_0", new InteropSDefT(classLoader, "sdf_desugar$sdf_desugar_0_0", context));
      varScope.addSVar("SdfDesugar_0_0", new InteropSDefT(classLoader, "sdf_desugar$$Sdf$Desugar_0_0", context));
      varScope.addSVar("SdfDesugarOnce_0_0", new InteropSDefT(classLoader, "sdf_desugar$$Sdf$Desugar$Once_0_0", context));
      varScope.addSVar("EnsureQuotes_0_0", new InteropSDefT(classLoader, "sdf_desugar$$Ensure$Quotes_0_0", context));
      varScope.addSVar("implode_aterm_0_0", new InteropSDefT(classLoader, "sdf_desugar$implode_aterm_0_0", context));
      varScope.addSVar("aterm_implode_list_0_0", new InteropSDefT(classLoader, "sdf_desugar$aterm_implode_list_0_0", context));
      varScope.addSVar("aterm_implode_int_0_0", new InteropSDefT(classLoader, "sdf_desugar$aterm_implode_int_0_0", context));
      varScope.addSVar("aterm_implode_fun_0_0", new InteropSDefT(classLoader, "sdf_desugar$aterm_implode_fun_0_0", context));
      varScope.addSVar("aterm_implode_appl_0_0", new InteropSDefT(classLoader, "sdf_desugar$aterm_implode_appl_0_0", context));
      varScope.addSVar("aterm_implode_afun_0_0", new InteropSDefT(classLoader, "sdf_desugar$aterm_implode_afun_0_0", context));
      varScope.addSVar("aterm_implode_annotated_0_0", new InteropSDefT(classLoader, "sdf_desugar$aterm_implode_annotated_0_0", context));
      varScope.addSVar("main_0_0", new InteropSDefT(classLoader, "sdf_desugar$main_0_0", context));
      varScope.addSVar("term_1_0", new InteropSDefT(classLoader, "sdf_desugar$term_1_0", context));
    }
  }
}