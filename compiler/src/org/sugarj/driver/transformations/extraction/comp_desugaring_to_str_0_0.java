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
    Fail21:
    { 
      IStrategoTerm term7 = term;
      IStrategoConstructor cons4 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success6:
      { 
        if(cons4 == ext_out._consPureDesugaring_1)
        { 
          Fail22:
          { 
            IStrategoTerm r_15 = null;
            r_15 = term.getSubterm(0);
            term = termFactory.makeAppl(ext_out._consSDefNoArgs_2, new IStrategoTerm[]{extraction.const0, termFactory.makeAppl(ext_out._consCall_2, new IStrategoTerm[]{extraction.constCallNoArgs0, (IStrategoTerm)termFactory.makeListCons(r_15, (IStrategoList)extraction.constNil0)})});
            if(true)
              break Success6;
          }
          term = term7;
        }
        if(cons4 == ext_out._consInjectDesugaring_4)
        { 
          IStrategoTerm q_15 = null;
          q_15 = term.getSubterm(0);
          term = termFactory.makeAppl(ext_out._consSDefNoArgs_2, new IStrategoTerm[]{extraction.const0, termFactory.makeAppl(ext_out._consCall_2, new IStrategoTerm[]{extraction.constCallNoArgs0, (IStrategoTerm)termFactory.makeListCons(q_15, (IStrategoList)extraction.constNil0)})});
        }
        else
        { 
          break Fail21;
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