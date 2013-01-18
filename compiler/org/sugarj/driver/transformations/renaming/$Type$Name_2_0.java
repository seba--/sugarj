package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Type$Name_2_0 extends Strategy 
{ 
  public static $Type$Name_2_0 instance = new $Type$Name_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_39, Strategy v_39)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("TypeName_2_0");
    Fail209:
    { 
      IStrategoTerm z_171 = null;
      IStrategoTerm x_171 = null;
      IStrategoTerm y_171 = null;
      IStrategoTerm a_172 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consTypeName_2 != ((IStrategoAppl)term).getConstructor())
        break Fail209;
      x_171 = term.getSubterm(0);
      y_171 = term.getSubterm(1);
      IStrategoList annos178 = term.getAnnotations();
      z_171 = annos178;
      term = u_39.invoke(context, x_171);
      if(term == null)
        break Fail209;
      a_172 = term;
      term = v_39.invoke(context, y_171);
      if(term == null)
        break Fail209;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consTypeName_2, new IStrategoTerm[]{a_172, term}), checkListAnnos(termFactory, z_171));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}