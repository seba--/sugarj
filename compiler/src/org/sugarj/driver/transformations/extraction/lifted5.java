package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted5 extends Strategy 
{ 
  public static final lifted5 instance = new lifted5();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail288:
    { 
      IStrategoTerm term6 = term;
      IStrategoConstructor cons5 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success7:
      { 
        if(cons5 == ext_out._consgrammar_elem_1)
        { 
          Fail289:
          { 
            IStrategoTerm h_150 = null;
            h_150 = term.getSubterm(0);
            term = h_150;
            if(true)
              break Success7;
          }
          term = term6;
        }
        if(cons5 == ext_out._constransformation_elem_1)
        { 
          IStrategoTerm i_150 = null;
          i_150 = term.getSubterm(0);
          term = comp_desugarings_to_sdf_0_0.instance.invoke(context, i_150);
          if(term == null)
            break Fail288;
        }
        else
        { 
          break Fail288;
        }
      }
      term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)extraction.constNil0);
      if(true)
        return term;
    }
    return null;
  }
}