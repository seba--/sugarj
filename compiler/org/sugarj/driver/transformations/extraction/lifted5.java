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
    Fail287:
    { 
      IStrategoTerm term6 = term;
      IStrategoConstructor cons5 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success7:
      { 
        if(cons5 == outt._consgrammar_elem_1)
        { 
          Fail288:
          { 
            IStrategoTerm c_150 = null;
            c_150 = term.getSubterm(0);
            term = c_150;
            if(true)
              break Success7;
          }
          term = term6;
        }
        if(cons5 == outt._constransformation_elem_1)
        { 
          IStrategoTerm d_150 = null;
          d_150 = term.getSubterm(0);
          term = comp_desugarings_to_sdf_0_0.instance.invoke(context, d_150);
          if(term == null)
            break Fail287;
        }
        else
        { 
          break Fail287;
        }
      }
      term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)extraction.constNil0);
      if(true)
        return term;
    }
    return null;
  }
}