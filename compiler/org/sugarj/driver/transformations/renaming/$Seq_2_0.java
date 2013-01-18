package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Seq_2_0 extends Strategy 
{ 
  public static $Seq_2_0 instance = new $Seq_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_46, Strategy v_46)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Seq_2_0");
    Fail337:
    { 
      IStrategoTerm b_192 = null;
      IStrategoTerm z_191 = null;
      IStrategoTerm a_192 = null;
      IStrategoTerm c_192 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSeq_2 != ((IStrategoAppl)term).getConstructor())
        break Fail337;
      z_191 = term.getSubterm(0);
      a_192 = term.getSubterm(1);
      IStrategoList annos283 = term.getAnnotations();
      b_192 = annos283;
      term = u_46.invoke(context, z_191);
      if(term == null)
        break Fail337;
      c_192 = term;
      term = v_46.invoke(context, a_192);
      if(term == null)
        break Fail337;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSeq_2, new IStrategoTerm[]{c_192, term}), checkListAnnos(termFactory, b_192));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}