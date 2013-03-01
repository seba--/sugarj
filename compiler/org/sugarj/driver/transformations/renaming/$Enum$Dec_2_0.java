package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Enum$Dec_2_0 extends Strategy 
{ 
  public static $Enum$Dec_2_0 instance = new $Enum$Dec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_31, Strategy n_31)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("EnumDec_2_0");
    Fail90:
    { 
      IStrategoTerm z_142 = null;
      IStrategoTerm x_142 = null;
      IStrategoTerm y_142 = null;
      IStrategoTerm a_143 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consEnumDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail90;
      x_142 = term.getSubterm(0);
      y_142 = term.getSubterm(1);
      IStrategoList annos66 = term.getAnnotations();
      z_142 = annos66;
      term = m_31.invoke(context, x_142);
      if(term == null)
        break Fail90;
      a_143 = term;
      term = n_31.invoke(context, y_142);
      if(term == null)
        break Fail90;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consEnumDec_2, new IStrategoTerm[]{a_143, term}), checkListAnnos(termFactory, z_142));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}