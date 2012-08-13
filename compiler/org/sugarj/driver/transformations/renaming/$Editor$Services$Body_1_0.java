package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Editor$Services$Body_1_0 extends Strategy 
{ 
  public static $Editor$Services$Body_1_0 instance = new $Editor$Services$Body_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("EditorServicesBody_1_0");
    Fail51:
    { 
      IStrategoTerm u_109 = null;
      IStrategoTerm t_109 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consEditorServicesBody_1 != ((IStrategoAppl)term).getConstructor())
        break Fail51;
      t_109 = term.getSubterm(0);
      IStrategoList annos33 = term.getAnnotations();
      u_109 = annos33;
      term = g_19.invoke(context, t_109);
      if(term == null)
        break Fail51;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consEditorServicesBody_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, u_109));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}