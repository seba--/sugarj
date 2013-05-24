package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Block$Comment$Def_3_0 extends Strategy 
{ 
  public static $Block$Comment$Def_3_0 instance = new $Block$Comment$Def_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_338, Strategy s_338, Strategy t_338)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("BlockCommentDef_3_0");
    Fail837:
    { 
      IStrategoTerm y_436 = null;
      IStrategoTerm v_436 = null;
      IStrategoTerm w_436 = null;
      IStrategoTerm x_436 = null;
      IStrategoTerm z_436 = null;
      IStrategoTerm a_437 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consBlockCommentDef_3 != ((IStrategoAppl)term).getConstructor())
        break Fail837;
      v_436 = term.getSubterm(0);
      w_436 = term.getSubterm(1);
      x_436 = term.getSubterm(2);
      IStrategoList annos85 = term.getAnnotations();
      y_436 = annos85;
      term = r_338.invoke(context, v_436);
      if(term == null)
        break Fail837;
      z_436 = term;
      term = s_338.invoke(context, w_436);
      if(term == null)
        break Fail837;
      a_437 = term;
      term = t_338.invoke(context, x_436);
      if(term == null)
        break Fail837;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consBlockCommentDef_3, new IStrategoTerm[]{z_436, a_437, term}), checkListAnnos(termFactory, y_436));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}