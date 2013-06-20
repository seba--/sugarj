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
    Fail11:
    { 
      IStrategoTerm z_14 = null;
      IStrategoTerm a_15 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consDesugarings_1 != ((IStrategoAppl)term).getConstructor())
        break Fail11;
      z_14 = term.getSubterm(0);
      term = map_1_0.instance.invoke(context, z_14, comp_desugaring_to_sdf_0_0.instance);
      if(term == null)
        break Fail11;
      term = concat_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail11;
      a_15 = term;
      IStrategoTerm term2 = term;
      Success2:
      { 
        Fail12:
        { 
          if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
            break Fail12;
          { 
            if(true)
              break Fail11;
            if(true)
              break Success2;
          }
        }
        term = term2;
      }
      term = termFactory.makeAppl(ext_out._conscontext_free_syntax_1, new IStrategoTerm[]{a_15});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}