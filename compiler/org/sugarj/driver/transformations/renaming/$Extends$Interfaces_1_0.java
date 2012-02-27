package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Extends$Interfaces_1_0 extends Strategy 
{ 
  public static $Extends$Interfaces_1_0 instance = new $Extends$Interfaces_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExtendsInterfaces_1_0");
    Fail40:
    { 
      IStrategoTerm f_104 = null;
      IStrategoTerm e_104 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consExtendsInterfaces_1 != ((IStrategoAppl)term).getConstructor())
        break Fail40;
      e_104 = term.getSubterm(0);
      IStrategoList annos26 = term.getAnnotations();
      f_104 = annos26;
      term = m_16.invoke(context, e_104);
      if(term == null)
        break Fail40;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consExtendsInterfaces_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, f_104));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}