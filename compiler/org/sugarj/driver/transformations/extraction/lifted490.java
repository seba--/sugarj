package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted490 extends Strategy 
{ 
  public static final lifted490 instance = new lifted490();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1124:
    { 
      IStrategoTerm term918 = term;
      IStrategoConstructor cons11 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success304:
      { 
        if(cons11 == ext._consgrammar_elem_1)
        { 
          Fail1125:
          { 
            IStrategoTerm x_473 = null;
            x_473 = term.getSubterm(0);
            term = x_473;
            if(true)
              break Success304;
          }
          term = term918;
        }
        if(cons11 == ext._constransformation_elem_1)
        { 
          IStrategoTerm y_473 = null;
          y_473 = term.getSubterm(0);
          term = comp_desugarings_to_sdf_0_0.instance.invoke(context, y_473);
          if(term == null)
            break Fail1124;
        }
        else
        { 
          break Fail1124;
        }
      }
      term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)extraction.constNil0);
      if(true)
        return term;
    }
    return null;
  }
}