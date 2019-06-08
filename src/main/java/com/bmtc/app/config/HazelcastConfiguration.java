package com.bmtc.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hazelcast.config.Config;
import com.hazelcast.config.EvictionPolicy;
import com.hazelcast.config.MapConfig;
import com.hazelcast.config.MaxSizeConfig;

@Configuration
public class HazelcastConfiguration {
	@Bean
	public Config hazelcastConfig() {
		Config config = new Config();
		config.setInstanceName("hazelcast-config")
			  .addMapConfig(
					  new MapConfig()
					  	.setName("my-map")
					  	.setMaxSizeConfig(new MaxSizeConfig(20, MaxSizeConfig.MaxSizePolicy.FREE_HEAP_SIZE))
					  	.setEvictionPolicy(EvictionPolicy.LRU)
					  	.setTimeToLiveSeconds(0)
			  );
		return config;
	}
}
