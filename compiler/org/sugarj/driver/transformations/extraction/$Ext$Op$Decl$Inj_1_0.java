package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Ext$Op$Decl$Inj_1_0 extends Strategy 
{ 
  public static $Ext$Op$Decl$Inj_1_0 instance = new $Ext$Op$Decl$Inj_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExtOpDeclInj_1_0");
    Fail129:
    { 
      IStrategoTerm p_123 = null;
      IStrategoTerm o_123 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consExtOpDeclInj_1 != ((IStrategoAppl)term).getConstructor())
        break Fail129;
      o_123 = term.getSubterm(0);
      IStrategoList annos102 = term.getAnnotations();
      p_123 = annos102;
      term = k_23.invoke(context, o_123);
      if(term == null)
        break Fail129;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consExtOpDeclInj_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, p_123));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}