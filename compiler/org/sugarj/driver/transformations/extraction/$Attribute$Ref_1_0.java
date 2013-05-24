package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Attribute$Ref_1_0 extends Strategy 
{ 
  public static $Attribute$Ref_1_0 instance = new $Attribute$Ref_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_337)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AttributeRef_1_0");
    Fail790:
    { 
      IStrategoTerm p_432 = null;
      IStrategoTerm o_432 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consAttributeRef_1 != ((IStrategoAppl)term).getConstructor())
        break Fail790;
      o_432 = term.getSubterm(0);
      IStrategoList annos54 = term.getAnnotations();
      p_432 = annos54;
      term = a_337.invoke(context, o_432);
      if(term == null)
        break Fail790;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consAttributeRef_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, p_432));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}