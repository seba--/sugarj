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
    Fail13:
    { 
      IStrategoTerm term3 = term;
      IStrategoConstructor cons3 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success3:
      { 
        if(cons3 == outt._consPureDesugaring_1)
        { 
          Fail14:
          { 
            term = extraction.constNil0;
            if(true)
              break Success3;
          }
          term = term3;
        }
        if(cons3 == outt._consInjectDesugaring_4)
        { 
          IStrategoTerm c_15 = null;
          IStrategoTerm d_15 = null;
          IStrategoTerm e_15 = null;
          c_15 = term.getSubterm(1);
          d_15 = term.getSubterm(2);
          e_15 = term.getSubterm(3);
          term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(outt._consprod_3, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(c_15, (IStrategoList)extraction.constNil0), d_15, e_15}), (IStrategoList)extraction.constNil0);
        }
        else
        { 
          break Fail13;
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