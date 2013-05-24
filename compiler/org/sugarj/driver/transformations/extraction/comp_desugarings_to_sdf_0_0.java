package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class comp_desugarings_to_sdf_0_0 extends Strategy 
{ 
  public static comp_desugarings_to_sdf_0_0 instance = new comp_desugarings_to_sdf_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("comp_desugarings_to_sdf_0_0");
    Fail713:
    { 
      IStrategoTerm w_332 = null;
      IStrategoTerm x_332 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consDesugarings_1 != ((IStrategoAppl)term).getConstructor())
        break Fail713;
      w_332 = term.getSubterm(0);
      term = map_1_0.instance.invoke(context, w_332, comp_desugaring_to_sdf_0_0.instance);
      if(term == null)
        break Fail713;
      term = concat_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail713;
      x_332 = term;
      IStrategoTerm term914 = term;
      Success292:
      { 
        Fail714:
        { 
          if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
            break Fail714;
          { 
            if(true)
              break Fail713;
            if(true)
              break Success292;
          }
        }
        term = term914;
      }
      term = termFactory.makeAppl(ext._conscontext_free_syntax_1, new IStrategoTerm[]{x_332});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}