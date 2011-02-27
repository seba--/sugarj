package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class comp_desugaring_to_str_0_0 extends Strategy 
{ 
  public static comp_desugaring_to_str_0_0 instance = new comp_desugaring_to_str_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail19:
    { 
      IStrategoTerm term6 = term;
      IStrategoConstructor cons4 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success5:
      { 
        if(cons4 == extraction._consPureDesugaring_1)
        { 
          Fail20:
          { 
            IStrategoTerm e_16 = null;
            e_16 = term.getSubterm(0);
            term = termFactory.makeAppl(extraction._consSDefNoArgs_2, new IStrategoTerm[]{extraction.const0, termFactory.makeAppl(extraction._consCall_2, new IStrategoTerm[]{extraction.constCallNoArgs0, (IStrategoTerm)termFactory.makeListCons(e_16, (IStrategoList)extraction.constNil0)})});
            if(true)
              break Success5;
          }
          term = term6;
        }
        if(cons4 == extraction._consInjectDesugaring_4)
        { 
          IStrategoTerm d_16 = null;
          d_16 = term.getSubterm(0);
          term = termFactory.makeAppl(extraction._consSDefNoArgs_2, new IStrategoTerm[]{extraction.const0, termFactory.makeAppl(extraction._consCall_2, new IStrategoTerm[]{extraction.constCallNoArgs0, (IStrategoTerm)termFactory.makeListCons(d_16, (IStrategoList)extraction.constNil0)})});
        }
        else
        { 
          break Fail19;
        }
      }
      if(true)
        return term;
    }
    context.push("comp_desugaring_to_str_0_0");
    context.popOnFailure();
    return null;
  }
}