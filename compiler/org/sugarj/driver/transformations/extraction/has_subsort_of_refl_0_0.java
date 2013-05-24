package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class has_subsort_of_refl_0_0 extends Strategy 
{ 
  public static has_subsort_of_refl_0_0 instance = new has_subsort_of_refl_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("has_subsort_of_refl_0_0");
    Fail104:
    { 
      IStrategoTerm term70 = term;
      Success63:
      { 
        Fail105:
        { 
          IStrategoTerm x_61 = null;
          TermReference y_61 = new TermReference();
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail105;
          x_61 = term.getSubterm(0);
          IStrategoTerm arg19 = term.getSubterm(1);
          if(arg19.getTermType() != IStrategoTerm.APPL || ext._consSort_2 != ((IStrategoAppl)arg19).getConstructor())
            break Fail105;
          IStrategoTerm arg20 = arg19.getSubterm(0);
          if(arg20.getTermType() != IStrategoTerm.STRING || !"List".equals(((IStrategoString)arg20).stringValue()))
            break Fail105;
          IStrategoTerm arg21 = arg19.getSubterm(1);
          if(arg21.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg21).isEmpty())
            break Fail105;
          if(y_61.value == null)
            y_61.value = ((IStrategoList)arg21).head();
          else
            if(y_61.value != ((IStrategoList)arg21).head() && !y_61.value.match(((IStrategoList)arg21).head()))
              break Fail105;
          IStrategoTerm arg22 = ((IStrategoList)arg21).tail();
          if(arg22.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg22).isEmpty())
            break Fail105;
          term = x_61;
          lifted27 lifted2710 = new lifted27();
          lifted2710.y_61 = y_61;
          term = map_1_0.instance.invoke(context, term, lifted2710);
          if(term == null)
            break Fail105;
          if(true)
            break Success63;
        }
        term = term70;
        IStrategoTerm term71 = term;
        Success64:
        { 
          Fail106:
          { 
            IStrategoTerm r_61 = null;
            IStrategoTerm s_61 = null;
            IStrategoTerm t_61 = null;
            if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
              break Fail106;
            IStrategoTerm arg23 = term.getSubterm(0);
            IStrategoTerm cons5 = context.invokePrimitive("SSL_get_constructor", term, NO_STRATEGIES, new IStrategoTerm[]{arg23});
            if(cons5.getTermType() != IStrategoTerm.STRING || !"".equals(((IStrategoString)cons5).stringValue()))
              break Fail106;
            IStrategoTerm args5 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{arg23});
            r_61 = args5;
            IStrategoTerm arg24 = term.getSubterm(1);
            if(arg24.getTermType() != IStrategoTerm.APPL || ext._consSort_2 != ((IStrategoAppl)arg24).getConstructor())
              break Fail106;
            IStrategoTerm arg25 = arg24.getSubterm(0);
            if(arg25.getTermType() != IStrategoTerm.STRING || !"Tuple".equals(((IStrategoString)arg25).stringValue()))
              break Fail106;
            s_61 = arg24.getSubterm(1);
            term = length_0_0.instance.invoke(context, r_61);
            if(term == null)
              break Fail106;
            t_61 = term;
            term = length_0_0.instance.invoke(context, s_61);
            if(term == null)
              break Fail106;
            term = termFactory.makeTuple(t_61, term);
            term = equal_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail106;
            term = termFactory.makeTuple(r_61, s_61);
            term = zip_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail106;
            term = map_1_0.instance.invoke(context, term, has_subsort_of_0_0.instance);
            if(term == null)
              break Fail106;
            if(true)
              break Success64;
          }
          term = term71;
          IStrategoTerm term72 = term;
          Success65:
          { 
            Fail107:
            { 
              if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
                break Fail107;
              IStrategoTerm arg26 = term.getSubterm(0);
              if(arg26.getTermType() != IStrategoTerm.APPL || ext._consNone_0 != ((IStrategoAppl)arg26).getConstructor())
                break Fail107;
              IStrategoTerm arg27 = term.getSubterm(1);
              if(arg27.getTermType() != IStrategoTerm.APPL || ext._consSort_2 != ((IStrategoAppl)arg27).getConstructor())
                break Fail107;
              IStrategoTerm arg28 = arg27.getSubterm(0);
              if(arg28.getTermType() != IStrategoTerm.STRING || !"Option".equals(((IStrategoString)arg28).stringValue()))
                break Fail107;
              IStrategoTerm arg29 = arg27.getSubterm(1);
              if(arg29.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg29).isEmpty())
                break Fail107;
              IStrategoTerm arg31 = ((IStrategoList)arg29).tail();
              if(arg31.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg31).isEmpty())
                break Fail107;
              if(true)
                break Success65;
            }
            term = term72;
            IStrategoTerm term73 = term;
            Success66:
            { 
              Fail108:
              { 
                IStrategoTerm p_61 = null;
                IStrategoTerm q_61 = null;
                if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
                  break Fail108;
                IStrategoTerm arg32 = term.getSubterm(0);
                if(arg32.getTermType() != IStrategoTerm.APPL || ext._consSome_1 != ((IStrategoAppl)arg32).getConstructor())
                  break Fail108;
                p_61 = arg32.getSubterm(0);
                IStrategoTerm arg33 = term.getSubterm(1);
                if(arg33.getTermType() != IStrategoTerm.APPL || ext._consSort_2 != ((IStrategoAppl)arg33).getConstructor())
                  break Fail108;
                IStrategoTerm arg34 = arg33.getSubterm(0);
                if(arg34.getTermType() != IStrategoTerm.STRING || !"Option".equals(((IStrategoString)arg34).stringValue()))
                  break Fail108;
                IStrategoTerm arg35 = arg33.getSubterm(1);
                if(arg35.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg35).isEmpty())
                  break Fail108;
                q_61 = ((IStrategoList)arg35).head();
                IStrategoTerm arg36 = ((IStrategoList)arg35).tail();
                if(arg36.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg36).isEmpty())
                  break Fail108;
                term = termFactory.makeTuple(p_61, q_61);
                term = has_subsort_of_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail108;
                if(true)
                  break Success66;
              }
              term = term73;
              IStrategoTerm term74 = term;
              Success67:
              { 
                Fail109:
                { 
                  IStrategoTerm m_61 = null;
                  IStrategoTerm n_61 = null;
                  IStrategoTerm o_61 = null;
                  if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
                    break Fail109;
                  n_61 = term.getSubterm(0);
                  IStrategoTerm arg37 = term.getSubterm(1);
                  if(arg37.getTermType() != IStrategoTerm.APPL || ext._consSort_2 != ((IStrategoAppl)arg37).getConstructor())
                    break Fail109;
                  IStrategoTerm arg38 = arg37.getSubterm(0);
                  if(arg38.getTermType() != IStrategoTerm.STRING || !"Alt".equals(((IStrategoString)arg38).stringValue()))
                    break Fail109;
                  IStrategoTerm arg39 = arg37.getSubterm(1);
                  if(arg39.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg39).isEmpty())
                    break Fail109;
                  m_61 = ((IStrategoList)arg39).head();
                  IStrategoTerm arg40 = ((IStrategoList)arg39).tail();
                  if(arg40.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg40).isEmpty())
                    break Fail109;
                  o_61 = ((IStrategoList)arg40).head();
                  IStrategoTerm arg41 = ((IStrategoList)arg40).tail();
                  if(arg41.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg41).isEmpty())
                    break Fail109;
                  Success68:
                  { 
                    Fail110:
                    { 
                      term = termFactory.makeTuple(n_61, m_61);
                      term = has_subsort_of_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail110;
                      if(true)
                        break Success68;
                    }
                    term = termFactory.makeTuple(n_61, o_61);
                    term = has_subsort_of_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail109;
                  }
                  if(true)
                    break Success67;
                }
                term = term74;
                IStrategoTerm term76 = term;
                Success69:
                { 
                  Fail111:
                  { 
                    IStrategoTerm k_61 = null;
                    IStrategoTerm l_61 = null;
                    if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
                      break Fail111;
                    k_61 = term.getSubterm(0);
                    l_61 = term.getSubterm(1);
                    term = is_string_0_0.instance.invoke(context, k_61);
                    if(term == null)
                      break Fail111;
                    term = is_lexical_sort_0_0.instance.invoke(context, l_61);
                    if(term == null)
                      break Fail111;
                    if(true)
                      break Success69;
                  }
                  term = _2_0.instance.invoke(context, term76, get_syntax_sort_0_0.instance, _Id.instance);
                  if(term == null)
                    break Fail104;
                  term = sort_match_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail104;
                }
              }
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