package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExtOpDeclInj_1_0");
    Fail115:
    { 
      IStrategoTerm y_109 = null;
      IStrategoTerm x_109 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consExtOpDeclInj_1 != ((IStrategoAppl)term).getConstructor())
        break Fail115;
      x_109 = term.getSubterm(0);
      IStrategoList annos102 = term.getAnnotations();
      y_109 = annos102;
      term = b_17.invoke(context, x_109);
      if(term == null)
        break Fail115;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consExtOpDeclInj_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, y_109));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}