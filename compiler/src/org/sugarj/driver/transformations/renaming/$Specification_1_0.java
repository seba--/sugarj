package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Specification_1_0 extends Strategy 
{ 
  public static $Specification_1_0 instance = new $Specification_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_12)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Specification_1_0");
    Fail46:
    { 
      IStrategoTerm z_96 = null;
      IStrategoTerm y_96 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSpecification_1 != ((IStrategoAppl)term).getConstructor())
        break Fail46;
      y_96 = term.getSubterm(0);
      IStrategoList annos37 = term.getAnnotations();
      z_96 = annos37;
      term = m_12.invoke(context, y_96);
      if(term == null)
        break Fail46;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSpecification_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, z_96));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}