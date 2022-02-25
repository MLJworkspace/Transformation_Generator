
#ifndef PROTOCOL1_HH
#define PROTOCOL1_HH

#include "umlrtinsignal.hh"
#include "umlrtoutsignal.hh"
#include "umlrtprotocol.hh"
#include "umlrtsignal.hh"
struct UMLRTCommsPort;

namespace Protocol1
{
    class Base : public UMLRTProtocol
    {
    public:
        Base( const UMLRTCommsPort * & srcPort );
        UMLRTOutSignal msg1() const;
    };
    class Conj : public UMLRTProtocol
    {
    public:
        Conj( const UMLRTCommsPort * & srcPort );
        UMLRTInSignal msg1() const;
    };
    enum SignalId
    {
        signal_msg1 = UMLRTSignal::FIRST_PROTOCOL_SIGNAL_ID
    };
};

#endif

