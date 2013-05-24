package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class comp_desugaring_to_sdf_0_0 extends Strategy 
{ 
  public static comp_desugaring_to_sdf_0_0 instance = new comp_desugaring_to_sdf_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail715:
    { 
      IStrategoTerm term915 = term;
      IStrategoConstructor cons9 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success293:
      { 
        if(cons9 == ext._consPureDesugaring_1)
        { 
          Fail716:
          { 
            term = extraction.constNil0;
            if(true)
              break Success293;
          }
          term = term915;
        }
        if(cons9 == ext._consInjectDesugaring_4)
        { 
          IStrategoTerm a_333 = null;
          IStrategoTerm b_333 = null;
          IStrategoTerm c_333 = null;
          a_333 = term.getSubterm(1);
          b_333 = term.getSubterm(2);
          c_333 = term.getSubterm(3);
          term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(ext._consprod_3, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(a_333, (IStrategoList)extraction.constNil0), b_333, c_333}), (IStrategoList)extraction.constNil0);
        }
        else
        { 
          break Fail715;
        }
      }
      if(true)
        return term;
    }
    context.push("comp_desugaring_to_sdf_0_0");
    context.popOnFailure();
    return null;
  }
}