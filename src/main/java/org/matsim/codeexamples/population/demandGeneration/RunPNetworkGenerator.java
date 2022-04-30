package org.matsim.codeexamples.population.demandGeneration;

import org.matsim.api.core.v01.Scenario;
import org.matsim.api.core.v01.network.Network;
import org.matsim.core.config.Config;
import org.matsim.core.config.ConfigUtils;
import org.matsim.core.network.algorithms.NetworkCleaner;
import org.matsim.core.network.io.NetworkWriter;
import org.matsim.core.scenario.ScenarioUtils;
import org.matsim.core.utils.geometry.CoordinateTransformation;
import org.matsim.core.utils.geometry.transformations.TransformationFactory;
import org.matsim.core.utils.io.OsmNetworkReader;

import java.io.FileInputStream;


/**
 * "P" has to do with "Potsdam" and "Z" with "Zurich", but P and Z are mostly used to show which classes belong together.
 */
public class RunPNetworkGenerator {

    public static void main(String[] args) {

        /*
         * The input file name.
         */
        String osm= "C:/Users/Daniel Jarvis/BYU_imt_optimization/src/main/cleveland.osm";


        /*
         * The coordinate system to use. OpenStreetMap uses NAD83, but for MATSim, we need a projection where distances
         * are (roughly) euclidean distances in meters.
         *
         * UTM 17N is one such possibility (for Ohio, at least).
         *
         */
        CoordinateTransformation ct=
                TransformationFactory.getCoordinateTransformation(TransformationFactory.NAD83_UTM17N, TransformationFactory.NAD83_UTM17N);

        /*
         * First, create a new Config and a new Scenario. One always has to do this when working with the MATSim
         * data container.
         *
         */
        Config config = ConfigUtils.createConfig();
        Scenario scenario = ScenarioUtils.createScenario(config);

        /*
         * Pick the Network from the Scenario for convenience.
         */
        Network network = scenario.getNetwork();

        OsmNetworkReader onr = new OsmNetworkReader(network,ct);
        onr.parse(osm);

        /*
         * Clean the Network. Cleaning means removing disconnected components, so that afterwards there is a route from every link
         * to every other link. This may not be the case in the initial network converted from OpenStreetMap.
         */
        new NetworkCleaner().run(network);

        /*
         * Write the Network to a MATSim network file.
         */
        new NetworkWriter(network).write("C:/Users/Daniel Jarvis/BYU_imt_optimization/scenarios/cleveland/network.xml");

    }
}
