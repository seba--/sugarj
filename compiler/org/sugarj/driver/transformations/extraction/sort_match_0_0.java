package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class sort_match_0_0 extends Strategy 
{ 
  public static sort_match_0_0 instance = new sort_match_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("sort_match_0_0");
    Fail330:
    { 
      IStrategoTerm term287 = term;
      Success280:
      { 
        Fail331:
        { 
          term = structurally_equal_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail331;
          if(true)
            break Success280;
        }
        term = term287;
        IStrategoTerm term288 = term;
        Success281:
        { 
          Fail332:
          { 
            IStrategoTerm b_91 = null;
            IStrategoTerm c_91 = null;
            if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
              break Fail332;
            IStrategoTerm arg42 = term.getSubterm(0);
            if(arg42.getTermType() != IStrategoTerm.APPL || ext._consSort_2 != ((IStrategoAppl)arg42).getConstructor())
              break Fail332;
            IStrategoTerm arg43 = arg42.getSubterm(0);
            if(arg43.getTermType() != IStrategoTerm.STRING || !"List".equals(((IStrategoString)arg43).stringValue()))
              break Fail332;
            IStrategoTerm arg44 = arg42.getSubterm(1);
            if(arg44.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg44).isEmpty())
              break Fail332;
            b_91 = ((IStrategoList)arg44).head();
            IStrategoTerm arg45 = ((IStrategoList)arg44).tail();
            if(arg45.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg45).isEmpty())
              break Fail332;
            IStrategoTerm arg46 = term.getSubterm(1);
            if(arg46.getTermType() != IStrategoTerm.APPL || ext._consSort_2 != ((IStrategoAppl)arg46).getConstructor())
              break Fail332;
            IStrategoTerm arg47 = arg46.getSubterm(0);
            if(arg47.getTermType() != IStrategoTerm.STRING || !"List".equals(((IStrategoString)arg47).stringValue()))
              break Fail332;
            IStrategoTerm arg48 = arg46.getSubterm(1);
            if(arg48.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg48).isEmpty())
              break Fail332;
            c_91 = ((IStrategoList)arg48).head();
            IStrategoTerm arg49 = ((IStrategoList)arg48).tail();
            if(arg49.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg49).isEmpty())
              break Fail332;
            term = termFactory.makeTuple(b_91, c_91);
            term = this.invoke(context, term);
            if(term == null)
              break Fail332;
            if(true)
              break Success281;
          }
          term = term288;
          IStrategoTerm term289 = term;
          Success282:
          { 
            Fail333:
            { 
              IStrategoTerm y_90 = null;
              IStrategoTerm z_90 = null;
              if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
                break Fail333;
              IStrategoTerm arg50 = term.getSubterm(0);
              if(arg50.getTermType() != IStrategoTerm.APPL || ext._consSort_2 != ((IStrategoAppl)arg50).getConstructor())
                break Fail333;
              IStrategoTerm arg51 = arg50.getSubterm(0);
              if(arg51.getTermType() != IStrategoTerm.STRING || !"Option".equals(((IStrategoString)arg51).stringValue()))
                break Fail333;
              IStrategoTerm arg52 = arg50.getSubterm(1);
              if(arg52.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg52).isEmpty())
                break Fail333;
              y_90 = ((IStrategoList)arg52).head();
              IStrategoTerm arg53 = ((IStrategoList)arg52).tail();
              if(arg53.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg53).isEmpty())
                break Fail333;
              IStrategoTerm arg54 = term.getSubterm(1);
              if(arg54.getTermType() != IStrategoTerm.APPL || ext._consSort_2 != ((IStrategoAppl)arg54).getConstructor())
                break Fail333;
              IStrategoTerm arg55 = arg54.getSubterm(0);
              if(arg55.getTermType() != IStrategoTerm.STRING || !"Option".equals(((IStrategoString)arg55).stringValue()))
                break Fail333;
              IStrategoTerm arg56 = arg54.getSubterm(1);
              if(arg56.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg56).isEmpty())
                break Fail333;
              z_90 = ((IStrategoList)arg56).head();
              IStrategoTerm arg57 = ((IStrategoList)arg56).tail();
              if(arg57.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg57).isEmpty())
                break Fail333;
              term = termFactory.makeTuple(y_90, z_90);
              term = this.invoke(context, term);
              if(term == null)
                break Fail333;
              if(true)
                break Success282;
            }
            term = term289;
            IStrategoTerm term290 = term;
            Success283:
            { 
              Fail334:
              { 
                IStrategoTerm m_90 = null;
                IStrategoTerm o_90 = null;
                IStrategoTerm p_90 = null;
                if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
                  break Fail334;
                IStrategoTerm arg58 = term.getSubterm(0);
                if(arg58.getTermType() != IStrategoTerm.APPL || ext._consSort_2 != ((IStrategoAppl)arg58).getConstructor())
                  break Fail334;
                IStrategoTerm arg59 = arg58.getSubterm(0);
                if(arg59.getTermType() != IStrategoTerm.STRING || !"Tuple".equals(((IStrategoString)arg59).stringValue()))
                  break Fail334;
                m_90 = arg58.getSubterm(1);
                IStrategoTerm arg60 = term.getSubterm(1);
                if(arg60.getTermType() != IStrategoTerm.APPL || ext._consSort_2 != ((IStrategoAppl)arg60).getConstructor())
                  break Fail334;
                IStrategoTerm arg61 = arg60.getSubterm(0);
                if(arg61.getTermType() != IStrategoTerm.STRING || !"Tuple".equals(((IStrategoString)arg61).stringValue()))
                  break Fail334;
                o_90 = arg60.getSubterm(1);
                term = length_0_0.instance.invoke(context, m_90);
                if(term == null)
                  break Fail334;
                p_90 = term;
                term = length_0_0.instance.invoke(context, o_90);
                if(term == null)
                  break Fail334;
                term = termFactory.makeTuple(p_90, term);
                term = equal_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail334;
                term = termFactory.makeTuple(m_90, o_90);
                term = zip_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail334;
                term = map_1_0.instance.invoke(context, term, sort_match_0_0.instance);
                if(term == null)
                  break Fail334;
                if(true)
                  break Success283;
              }
              term = term290;
              IStrategoTerm term291 = term;
              Success284:
              { 
                Fail335:
                { 
                  IStrategoTerm i_90 = null;
                  IStrategoTerm j_90 = null;
                  IStrategoTerm l_90 = null;
                  if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
                    break Fail335;
                  IStrategoTerm arg62 = term.getSubterm(0);
                  if(arg62.getTermType() != IStrategoTerm.APPL || ext._consSort_2 != ((IStrategoAppl)arg62).getConstructor())
                    break Fail335;
                  IStrategoTerm arg63 = arg62.getSubterm(0);
                  if(arg63.getTermType() != IStrategoTerm.STRING || !"Alt".equals(((IStrategoString)arg63).stringValue()))
                    break Fail335;
                  IStrategoTerm arg64 = arg62.getSubterm(1);
                  if(arg64.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg64).isEmpty())
                    break Fail335;
                  i_90 = ((IStrategoList)arg64).head();
                  IStrategoTerm arg65 = ((IStrategoList)arg64).tail();
                  if(arg65.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg65).isEmpty())
                    break Fail335;
                  j_90 = ((IStrategoList)arg65).head();
                  IStrategoTerm arg66 = ((IStrategoList)arg65).tail();
                  if(arg66.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg66).isEmpty())
                    break Fail335;
                  l_90 = term.getSubterm(1);
                  Success285:
                  { 
                    Fail336:
                    { 
                      term = termFactory.makeTuple(i_90, l_90);
                      term = this.invoke(context, term);
                      if(term == null)
                        break Fail336;
                      if(true)
                        break Success285;
                    }
                    term = termFactory.makeTuple(j_90, l_90);
                    term = this.invoke(context, term);
                    if(term == null)
                      break Fail335;
                  }
                  if(true)
                    break Success284;
                }
                term = term291;
                IStrategoTerm term293 = term;
                Success286:
                { 
                  Fail337:
                  { 
                    IStrategoTerm d_90 = null;
                    IStrategoTerm f_90 = null;
                    IStrategoTerm g_90 = null;
                    if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
                      break Fail337;
                    f_90 = term.getSubterm(0);
                    IStrategoTerm arg67 = term.getSubterm(1);
                    if(arg67.getTermType() != IStrategoTerm.APPL || ext._consSort_2 != ((IStrategoAppl)arg67).getConstructor())
                      break Fail337;
                    IStrategoTerm arg68 = arg67.getSubterm(0);
                    if(arg68.getTermType() != IStrategoTerm.STRING || !"Alt".equals(((IStrategoString)arg68).stringValue()))
                      break Fail337;
                    IStrategoTerm arg69 = arg67.getSubterm(1);
                    if(arg69.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg69).isEmpty())
                      break Fail337;
                    d_90 = ((IStrategoList)arg69).head();
                    IStrategoTerm arg70 = ((IStrategoList)arg69).tail();
                    if(arg70.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg70).isEmpty())
                      break Fail337;
                    g_90 = ((IStrategoList)arg70).head();
                    IStrategoTerm arg71 = ((IStrategoList)arg70).tail();
                    if(arg71.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg71).isEmpty())
                      break Fail337;
                    Success287:
                    { 
                      Fail338:
                      { 
                        term = termFactory.makeTuple(f_90, d_90);
                        term = this.invoke(context, term);
                        if(term == null)
                          break Fail338;
                        if(true)
                          break Success287;
                      }
                      term = termFactory.makeTuple(f_90, g_90);
                      term = this.invoke(context, term);
                      if(term == null)
                        break Fail337;
                    }
                    if(true)
                      break Success286;
                  }
                  term = _2_0.instance.invoke(context, term293, lifted35.instance, _Id.instance);
                  if(term == null)
                    break Fail330;
                  term = this.invoke(context, term);
                  if(term == null)
                    break Fail330;
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