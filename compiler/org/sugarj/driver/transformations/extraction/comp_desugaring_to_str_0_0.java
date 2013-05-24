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
    Fail723:
    { 
      IStrategoTerm term919 = term;
      IStrategoConstructor cons10 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success296:
      { 
        if(cons10 == ext._consPureDesugaring_1)
        { 
          Fail724:
          { 
            IStrategoTerm o_333 = null;
            o_333 = term.getSubterm(0);
            term = termFactory.makeAppl(ext._consSDefNoArgs_2, new IStrategoTerm[]{extraction.const654, termFactory.makeAppl(ext._consCall_2, new IStrategoTerm[]{extraction.constSVar1, (IStrategoTerm)termFactory.makeListCons(o_333, (IStrategoList)extraction.constNil0)})});
            if(true)
              break Success296;
          }
          term = term919;
        }
        if(cons10 == ext._consInjectDesugaring_4)
        { 
          IStrategoTerm n_333 = null;
          n_333 = term.getSubterm(0);
          term = termFactory.makeAppl(ext._consSDefNoArgs_2, new IStrategoTerm[]{extraction.const654, termFactory.makeAppl(ext._consCall_2, new IStrategoTerm[]{extraction.constSVar1, (IStrategoTerm)termFactory.makeListCons(n_333, (IStrategoList)extraction.constNil0)})});
        }
        else
        { 
          break Fail723;
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