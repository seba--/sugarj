package org.sugarj.common.typesmart;

import org.spoofax.interpreter.core.IContext;
import org.spoofax.interpreter.core.InterpreterException;
import org.spoofax.interpreter.stratego.CallT;
import org.spoofax.interpreter.stratego.SDefT;
import org.spoofax.interpreter.stratego.Strategy;
import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoConstructor;
import org.spoofax.interpreter.terms.IStrategoInt;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoPlaceholder;
import org.spoofax.interpreter.terms.IStrategoReal;
import org.spoofax.interpreter.terms.IStrategoString;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.IStrategoTuple;
import org.spoofax.interpreter.terms.ITermFactory;
import org.spoofax.terms.AbstractTermFactory;
import org.spoofax.terms.StrategoAnnotation;
import org.spoofax.terms.StrategoList;
import org.spoofax.terms.StrategoString;
import org.spoofax.terms.StrategoTerm;
import org.spoofax.terms.StrategoWrapped;
import org.spoofax.terms.TermFactory;
import org.strategoxt.lang.StrategoException;
import org.sugarj.common.ATermCommands;

/**
 * When constructing an application term, this term factory looks for the
 * existing of a type-smart constructor. If such constructor exists, it is used
 * for the construction of the term. Otherwise, a standard build is performed
 * using the base factory.
 * 
 * @author Sebastian Erdweg
 */
public class TypesmartTermFactory extends AbstractTermFactory {

  private IContext context;
  private ITermFactory baseFactory;

  public static TypesmartTermFactory registerNewTypeSmartTermFactory(IContext context) {
    TypesmartTermFactory factory = new TypesmartTermFactory(context.getFactory(), context);
    context.setFactory(factory);
    return factory;
  }

  public TypesmartTermFactory(ITermFactory baseFactory, IContext context) {
    super(baseFactory.getDefaultStorageType());
    this.baseFactory = baseFactory;
    this.context = context;
  }

  @Override
  public IStrategoAppl makeAppl(IStrategoConstructor ctr, IStrategoTerm[] terms, IStrategoList annotations) {

    String smartCtrName = "smart-" + ctr.getName();
    smartCtrName = smartCtrName.replace("-", "_") + "_0_" + terms.length;

    try {
      SDefT sdef = context.lookupSVar(smartCtrName);

      // no check defined
      if (sdef == null)
        return baseFactory.makeAppl(ctr, terms, annotations);

      System.out.println("Typesmart " + ctr);

      // apply smart constructor to argument terms
      CallT smartCall = new CallT(smartCtrName, new Strategy[0], new IStrategoTerm[0]);
      IStrategoTerm currentWas = context.current();
      IStrategoTerm t;
      try {
        boolean smartOk = smartCall.evaluateWithArgs(context, new Strategy[0], terms);

        if (!smartOk) {
          IStrategoTerm failedTerm = baseFactory.makeAppl(ctr, terms, annotations);
          throw new StrategoException("Smart constructor failed for: " + ATermCommands.stripAnnos(failedTerm));
        }

        t = context.current();
      } finally {
        context.setCurrent(currentWas);
      }

      if (!(t instanceof IStrategoAppl))
        throw new StrategoException("Smart constructor should have returned an application term, but was: " + t);

      IStrategoAppl appl = (IStrategoAppl) t;
      if (!appl.getConstructor().equals(ctr))
        throw new StrategoException("Smart constructor should have returned an application term with constructor " + ctr + ", but was: " + t);

      return appl;
    } catch (InterpreterException e) {
      throw new StrategoException("Type-unsafe constructor application " + ctr, e);
    }
  }

  @Override
  public ITermFactory getFactoryWithStorageType(int arg0) {
    return baseFactory.getFactoryWithStorageType(arg0);
  }

  /**
   * Identical to {@link TermFactory.annotateTerm} except that it retains sort attachments.
   */
  @SuppressWarnings("deprecation")
  @Override
  public IStrategoTerm annotateTerm(IStrategoTerm term, IStrategoList annotations) {
    IStrategoList currentAnnos = term.getAnnotations();
    IStrategoTerm result;
    if (currentAnnos == annotations || annotations.isEmpty() && currentAnnos.isEmpty()) { // cheap check
      return term;
    } else if (term.getStorageType() == IStrategoTerm.MAXIMALLY_SHARED) {
      if (term == EMPTY_LIST) {
        if (annotations == EMPTY_LIST || annotations.isEmpty()) {
          result = EMPTY_LIST;
        } else {
          result = new StrategoList(null, null, annotations, defaultStorageType);
        }
      } else if (term.getTermType() == IStrategoTerm.STRING) {
        String value = ((IStrategoString) term).stringValue();
        if (annotations == EMPTY_LIST || annotations.isEmpty()) {
          result = makeString(value);
        } else {
          result = new StrategoString(value, annotations, defaultStorageType);
        }
      } else if (currentAnnos == EMPTY_LIST) {
        result = new StrategoAnnotation(this, term, annotations);
      } else if (term instanceof StrategoAnnotation) {
        term = ((StrategoAnnotation) term).getWrapped();
        // int storageType = min(defaultStorageType, getStorageType(term));
        result = new StrategoAnnotation(this, term, annotations);
      } else {
        throw new UnsupportedOperationException("Unable to annotate term of type " + term.getClass().getName());
      }
    } else if ((annotations == EMPTY_LIST || annotations.isEmpty()) && term.getTermType() == IStrategoTerm.STRING) {
      result = makeString(((IStrategoString) term).stringValue());
    } else if (term instanceof StrategoTerm) {
      result = ((StrategoTerm) term).clone(false);
      assert !(result instanceof StrategoWrapped) : "not yet supported";
      ((StrategoTerm) result).internalSetAnnotations(annotations);
      assert result.getStorageType() != IStrategoTerm.MAXIMALLY_SHARED;
    } else {
      throw new UnsupportedOperationException("Unable to annotate term of type " + term.getClass().getName() + " in " + getClass().getName());
    }

    TypesmartSortAttachment attach = TypesmartSortAttachment.get(term);
    if (attach != null)
      TypesmartSortAttachment.put(result, attach);
    
    return result;
  }

  @Override
  public IStrategoInt makeInt(int arg0) {
    return baseFactory.makeInt(arg0);
  }

  @Override
  public IStrategoPlaceholder makePlaceholder(IStrategoTerm arg0) {
    return baseFactory.makePlaceholder(arg0);
  }

  @Override
  public IStrategoReal makeReal(double arg0) {
    return baseFactory.makeReal(arg0);
  }

  @Override
  public IStrategoString makeString(String arg0) {
    return baseFactory.makeString(arg0);
  }

  @Override
  public IStrategoString tryMakeUniqueString(String arg0) {
    return baseFactory.makeString(arg0);
  }

  @Override
  public IStrategoList makeList(IStrategoTerm[] arg0, IStrategoList arg1) {
    return baseFactory.makeList(arg0, arg1);
  }

  @Override
  public IStrategoList makeListCons(IStrategoTerm arg0, IStrategoList arg1, IStrategoList arg2) {
    return baseFactory.makeListCons(arg0, arg1, arg2);
  }

  @Override
  public IStrategoTuple makeTuple(IStrategoTerm[] arg0, IStrategoList arg1) {
    return baseFactory.makeTuple(arg0, arg1);
  }

  public ITermFactory getBaseFactory() {
    return baseFactory;
  }
}
