package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Enum$Dec$Head_3_0 extends Strategy 
{ 
  public static $Enum$Dec$Head_3_0 instance = new $Enum$Dec$Head_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_23, Strategy c_23, Strategy d_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("EnumDecHead_3_0");
    Fail99:
    { 
      IStrategoTerm c_120 = null;
      IStrategoTerm x_119 = null;
      IStrategoTerm y_119 = null;
      IStrategoTerm z_119 = null;
      IStrategoTerm g_120 = null;
      IStrategoTerm j_120 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consEnumDecHead_3 != ((IStrategoAppl)term).getConstructor())
        break Fail99;
      x_119 = term.getSubterm(0);
      y_119 = term.getSubterm(1);
      z_119 = term.getSubterm(2);
      IStrategoList annos80 = term.getAnnotations();
      c_120 = annos80;
      term = b_23.invoke(context, x_119);
      if(term == null)
        break Fail99;
      g_120 = term;
      term = c_23.invoke(context, y_119);
      if(term == null)
        break Fail99;
      j_120 = term;
      term = d_23.invoke(context, z_119);
      if(term == null)
        break Fail99;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consEnumDecHead_3, new IStrategoTerm[]{g_120, j_120, term}), checkListAnnos(termFactory, c_120));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}