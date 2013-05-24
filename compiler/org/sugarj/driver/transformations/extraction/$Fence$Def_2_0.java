package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Fence$Def_2_0 extends Strategy 
{ 
  public static $Fence$Def_2_0 instance = new $Fence$Def_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_338, Strategy v_338)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("FenceDef_2_0");
    Fail839:
    { 
      IStrategoTerm e_437 = null;
      IStrategoTerm c_437 = null;
      IStrategoTerm d_437 = null;
      IStrategoTerm f_437 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consFenceDef_2 != ((IStrategoAppl)term).getConstructor())
        break Fail839;
      c_437 = term.getSubterm(0);
      d_437 = term.getSubterm(1);
      IStrategoList annos86 = term.getAnnotations();
      e_437 = annos86;
      term = u_338.invoke(context, c_437);
      if(term == null)
        break Fail839;
      f_437 = term;
      term = v_338.invoke(context, d_437);
      if(term == null)
        break Fail839;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consFenceDef_2, new IStrategoTerm[]{f_437, term}), checkListAnnos(termFactory, e_437));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}