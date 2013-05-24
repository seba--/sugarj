package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted366 extends Strategy 
{ 
  TermReference u_263;

  TermReference v_263;

  TermReference y_263;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1388:
    { 
      IStrategoTerm a_264 = null;
      IStrategoTerm b_264 = null;
      IStrategoTerm f_264 = null;
      IStrategoTerm n_264 = null;
      IStrategoTerm o_264 = null;
      a_264 = term;
      if(u_263.value == null)
        break Fail1388;
      term = termFactory.makeTuple(u_263.value, extraction.constSortNoArgs18);
      IStrategoTerm term768 = term;
      Success446:
      { 
        Fail1389:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1389;
          if(true)
            break Success446;
        }
        term = term768;
        IStrategoTerm h_264 = null;
        h_264 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, h_264, extraction.const547);
        if(term == null)
          break Fail1388;
        if(true)
          break Fail1388;
      }
      term = a_264;
      b_264 = a_264;
      if(v_263.value == null)
        break Fail1388;
      term = termFactory.makeTuple(v_263.value, extraction.constSort38);
      IStrategoTerm term769 = term;
      Success447:
      { 
        Fail1390:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1390;
          if(true)
            break Success447;
        }
        term = term769;
        IStrategoTerm j_264 = null;
        j_264 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, j_264, extraction.const547);
        if(term == null)
          break Fail1388;
        if(true)
          break Fail1388;
      }
      term = b_264;
      f_264 = b_264;
      if(y_263.value == null)
        break Fail1388;
      term = termFactory.makeTuple(y_263.value, extraction.constSort39);
      IStrategoTerm term770 = term;
      Success448:
      { 
        Fail1391:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1391;
          if(true)
            break Success448;
        }
        term = term770;
        IStrategoTerm m_264 = null;
        m_264 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, m_264, extraction.const547);
        if(term == null)
          break Fail1388;
        if(true)
          break Fail1388;
      }
      term = f_264;
      o_264 = f_264;
      n_264 = term;
      term = o_264;
      IStrategoList list324;
      list324 = checkListTail(n_264);
      if(list324 == null)
        break Fail1388;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list324);
      if(true)
        return term;
    }
    return null;
  }
}