package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Field$Dec_3_0 extends Strategy 
{ 
  public static $Field$Dec_3_0 instance = new $Field$Dec_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_35, Strategy c_35, Strategy d_35)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("FieldDec_3_0");
    Fail138:
    { 
      IStrategoTerm t_155 = null;
      IStrategoTerm q_155 = null;
      IStrategoTerm r_155 = null;
      IStrategoTerm s_155 = null;
      IStrategoTerm u_155 = null;
      IStrategoTerm v_155 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consFieldDec_3 != ((IStrategoAppl)term).getConstructor())
        break Fail138;
      q_155 = term.getSubterm(0);
      r_155 = term.getSubterm(1);
      s_155 = term.getSubterm(2);
      IStrategoList annos109 = term.getAnnotations();
      t_155 = annos109;
      term = b_35.invoke(context, q_155);
      if(term == null)
        break Fail138;
      u_155 = term;
      term = c_35.invoke(context, r_155);
      if(term == null)
        break Fail138;
      v_155 = term;
      term = d_35.invoke(context, s_155);
      if(term == null)
        break Fail138;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consFieldDec_3, new IStrategoTerm[]{u_155, v_155, term}), checkListAnnos(termFactory, t_155));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}