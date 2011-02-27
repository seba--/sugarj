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
    Fail11:
    { 
      IStrategoTerm term2 = term;
      IStrategoConstructor cons3 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success2:
      { 
        if(cons3 == extraction._consPureDesugaring_1)
        { 
          Fail12:
          { 
            term = extraction.constNil0;
            if(true)
              break Success2;
          }
          term = term2;
        }
        if(cons3 == extraction._consInjectDesugaring_4)
        { 
          IStrategoTerm q_15 = null;
          IStrategoTerm r_15 = null;
          IStrategoTerm s_15 = null;
          q_15 = term.getSubterm(1);
          r_15 = term.getSubterm(2);
          s_15 = term.getSubterm(3);
          term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(extraction._consprod_3, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(q_15, (IStrategoList)extraction.constNil0), r_15, s_15}), (IStrategoList)extraction.constNil0);
        }
        else
        { 
          break Fail11;
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