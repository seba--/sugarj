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
        if(cons3 == ext_out._consPureDesugaring_1)
        { 
          Fail14:
          { 
            term = extraction.constNil0;
            if(true)
              break Success3;
          }
          term = term3;
        }
        if(cons3 == ext_out._consInjectDesugaring_4)
        { 
          IStrategoTerm d_15 = null;
          IStrategoTerm e_15 = null;
          IStrategoTerm f_15 = null;
          d_15 = term.getSubterm(1);
          e_15 = term.getSubterm(2);
          f_15 = term.getSubterm(3);
          term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(ext_out._consprod_3, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(d_15, (IStrategoList)extraction.constNil0), e_15, f_15}), (IStrategoList)extraction.constNil0);
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