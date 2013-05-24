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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_346)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExtOpDeclInj_1_0");
    Fail955:
    { 
      IStrategoTerm f_456 = null;
      IStrategoTerm e_456 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consExtOpDeclInj_1 != ((IStrategoAppl)term).getConstructor())
        break Fail955;
      e_456 = term.getSubterm(0);
      IStrategoList annos198 = term.getAnnotations();
      f_456 = annos198;
      term = f_346.invoke(context, e_456);
      if(term == null)
        break Fail955;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consExtOpDeclInj_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, f_456));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}