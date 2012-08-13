package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Editor$Services$Dec$Head_2_0 extends Strategy 
{ 
  public static $Editor$Services$Dec$Head_2_0 instance = new $Editor$Services$Dec$Head_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_19, Strategy f_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("EditorServicesDecHead_2_0");
    Fail50:
    { 
      IStrategoTerm o_109 = null;
      IStrategoTerm m_109 = null;
      IStrategoTerm n_109 = null;
      IStrategoTerm r_109 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consEditorServicesDecHead_2 != ((IStrategoAppl)term).getConstructor())
        break Fail50;
      m_109 = term.getSubterm(0);
      n_109 = term.getSubterm(1);
      IStrategoList annos32 = term.getAnnotations();
      o_109 = annos32;
      term = e_19.invoke(context, m_109);
      if(term == null)
        break Fail50;
      r_109 = term;
      term = f_19.invoke(context, n_109);
      if(term == null)
        break Fail50;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consEditorServicesDecHead_2, new IStrategoTerm[]{r_109, term}), checkListAnnos(termFactory, o_109));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}