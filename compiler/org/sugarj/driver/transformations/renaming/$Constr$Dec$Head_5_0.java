package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Constr$Dec$Head_5_0 extends Strategy 
{ 
  public static $Constr$Dec$Head_5_0 instance = new $Constr$Dec$Head_5_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_18, Strategy f_18, Strategy g_18, Strategy h_18, Strategy i_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ConstrDecHead_5_0");
    Fail57:
    { 
      IStrategoTerm d_109 = null;
      IStrategoTerm y_108 = null;
      IStrategoTerm z_108 = null;
      IStrategoTerm a_109 = null;
      IStrategoTerm b_109 = null;
      IStrategoTerm c_109 = null;
      IStrategoTerm e_109 = null;
      IStrategoTerm f_109 = null;
      IStrategoTerm g_109 = null;
      IStrategoTerm h_109 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consConstrDecHead_5 != ((IStrategoAppl)term).getConstructor())
        break Fail57;
      y_108 = term.getSubterm(0);
      z_108 = term.getSubterm(1);
      a_109 = term.getSubterm(2);
      b_109 = term.getSubterm(3);
      c_109 = term.getSubterm(4);
      IStrategoList annos45 = term.getAnnotations();
      d_109 = annos45;
      term = e_18.invoke(context, y_108);
      if(term == null)
        break Fail57;
      e_109 = term;
      term = f_18.invoke(context, z_108);
      if(term == null)
        break Fail57;
      f_109 = term;
      term = g_18.invoke(context, a_109);
      if(term == null)
        break Fail57;
      g_109 = term;
      term = h_18.invoke(context, b_109);
      if(term == null)
        break Fail57;
      h_109 = term;
      term = i_18.invoke(context, c_109);
      if(term == null)
        break Fail57;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consConstrDecHead_5, new IStrategoTerm[]{e_109, f_109, g_109, h_109, term}), checkListAnnos(termFactory, d_109));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}