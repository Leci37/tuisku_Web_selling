//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: ADBE_15Min_1KON_65c12d4e Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADBE_15Min_1KON_65c12d4e", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADBE_15Min_65c12d4e(oscp, media, media_azul, verde_media, azul, tprice, azul_mean, verde, nvim, marron, pvimin, pvi, nvimax, verde_mean, xmf, source, stoc, pvimax, nvi_ema, nvi, xrsi, pvim, marron_mean, nvimin, BollOsc, verde_azul, pvi_ema)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( verde_media <= -3.28701 )
		if( nvi_ema <= 1.68733 )
			if( xrsi <= 38.1677 )
				if( pvim <= 0.011948 )
					if( verde_azul <= -78.8939 )
						if( verde_media <= -171.478 )
							ret := 0.000000
						if( verde_media > -171.478 )
							if( xrsi <= 36.348 )
								if( source <= 275.931 )
									ret := 0.600000
								if( source > 275.931 )
									ret := 0.989796 // buy
							if( xrsi > 36.348 )
								ret := 0.200000
					if( verde_azul > -78.8939 )
						if( xmf <= 2.16604 )
							if( azul_mean <= 3.19974 )
								if( xrsi <= 30.486 )
									ret := 0.413793
								if( xrsi > 30.486 )
									ret := -0.750000 // sell
							if( azul_mean > 3.19974 )
								if( marron_mean <= 2.3001 )
									ret := -1.000000 // sell
								if( marron_mean > 2.3001 )
									ret := -0.750000 // sell
						if( xmf > 2.16604 )
							if( verde_mean <= -7.39746 )
								if( oscp <= -46.5104 )
									ret := 0.645833
								if( oscp > -46.5104 )
									ret := -0.018987
							if( verde_mean > -7.39746 )
								if( marron <= 15.7096 )
									ret := 0.555556
								if( marron > 15.7096 )
									ret := 0.279302
				if( pvim > 0.011948 )
					if( xmf <= 0.592361 )
						if( nvimax <= 1.1063 )
							if( marron_mean <= -3.1934 )
								if( BollOsc <= -78.5181 )
									ret := -1.000000 // sell
								if( BollOsc > -78.5181 )
									ret := 0.537313
							if( marron_mean > -3.1934 )
								if( marron <= -0.142741 )
									ret := -0.245902
								if( marron > -0.142741 )
									ret := 0.846154 // buy
						if( nvimax > 1.1063 )
							if( tprice <= 590.189 )
								if( stoc <= 24.5207 )
									ret := -0.577922
								if( stoc > 24.5207 )
									ret := 0.333333
							if( tprice > 590.189 )
								if( media <= 2.21025 )
									ret := 0.764706 // buy
								if( media > 2.21025 )
									ret := -0.333333
					if( xmf > 0.592361 )
						if( verde_mean <= -19.8859 )
							if( pvimax <= 0.258752 )
								if( verde_media <= -33.9789 )
									ret := 0.000000
								if( verde_media > -33.9789 )
									ret := -0.338816
							if( pvimax > 0.258752 )
								if( pvi_ema <= 0.392231 )
									ret := 0.383193
								if( pvi_ema > 0.392231 )
									ret := 0.041908
						if( verde_mean > -19.8859 )
							if( verde_azul <= 144.444 )
								if( stoc <= 7.4366 )
									ret := 0.332927
								if( stoc > 7.4366 )
									ret := 0.168870
							if( verde_azul > 144.444 )
								if( tprice <= 298.995 )
									ret := 0.903226 // buy
								if( tprice > 298.995 )
									ret := -0.333333
			if( xrsi > 38.1677 )
				if( azul <= 32.5763 )
					if( pvimax <= 0.48986 )
						if( oscp <= -58.7657 )
							if( marron <= 14.1839 )
								if( BollOsc <= -41.1119 )
									ret := -0.833333 // sell
								if( BollOsc > -41.1119 )
									ret := 0.250000
							if( marron > 14.1839 )
								if( xmf <= 60.8802 )
									ret := 0.763158 // buy
								if( xmf > 60.8802 )
									ret := 0.000000
						if( oscp > -58.7657 )
							if( xmf <= 7.43748 )
								if( media <= 21.1337 )
									ret := 0.666667
								if( media > 21.1337 )
									ret := -0.189420
							if( xmf > 7.43748 )
								if( azul_mean <= -49.263 )
									ret := -0.316129
								if( azul_mean > -49.263 )
									ret := 0.081703
					if( pvimax > 0.48986 )
						if( media <= 30.1823 )
							if( verde_mean <= 18.2098 )
								if( azul_mean <= -24.5846 )
									ret := 0.333333
								if( azul_mean > -24.5846 )
									ret := -0.603448
							if( verde_mean > 18.2098 )
								ret := 0.800000 // buy
						if( media > 30.1823 )
							if( tprice <= 572.09 )
								if( pvi_ema <= 0.772612 )
									ret := 0.257349
								if( pvi_ema > 0.772612 )
									ret := -1.000000 // sell
							if( tprice > 572.09 )
								if( marron_mean <= 49.2506 )
									ret := 0.337838
								if( marron_mean > 49.2506 )
									ret := -0.392000
				if( azul > 32.5763 )
					if( pvi <= -0.083089 )
						if( nvimax <= 1.68754 )
							if( oscp <= -25.7038 )
								ret := 1.000000 // buy
							if( oscp > -25.7038 )
								ret := 0.333333
						if( nvimax > 1.68754 )
							ret := 0.000000
					if( pvi > -0.083089 )
						if( media <= 38.1439 )
							if( verde_mean <= 18.3669 )
								if( pvi_ema <= 0.405099 )
									ret := -0.329609
								if( pvi_ema > 0.405099 )
									ret := -0.839286 // sell
							if( verde_mean > 18.3669 )
								if( oscp <= -22.2548 )
									ret := -0.428571
								if( oscp > -22.2548 )
									ret := 0.733333 // buy
						if( media > 38.1439 )
							if( xmf <= 57.8218 )
								if( verde_mean <= -34.8267 )
									ret := -0.531250
								if( verde_mean > -34.8267 )
									ret := 0.098101
							if( xmf > 57.8218 )
								if( azul_mean <= 39.7159 )
									ret := -0.036765
								if( azul_mean > 39.7159 )
									ret := -0.496183
		if( nvi_ema > 1.68733 )
			if( azul_mean <= -22.8053 )
				if( nvi <= 1.76988 )
					if( source <= 359.131 )
						if( media <= 0.78331 )
							ret := 0.750000 // buy
						if( media > 0.78331 )
							if( nvim <= 1.76785 )
								if( verde_azul <= 34.6044 )
									ret := -1.000000 // sell
								if( verde_azul > 34.6044 )
									ret := -0.500000
							if( nvim > 1.76785 )
								ret := 0.000000
					if( source > 359.131 )
						if( verde_mean <= 9.09379 )
							if( azul_mean <= -87.2194 )
								if( stoc <= 11.8365 )
									ret := -0.571429
								if( stoc > 11.8365 )
									ret := -1.000000 // sell
							if( azul_mean > -87.2194 )
								if( nvimax <= 1.73677 )
									ret := 0.027174
								if( nvimax > 1.73677 )
									ret := 0.358852
						if( verde_mean > 9.09379 )
							if( stoc <= 52.8814 )
								if( verde_media <= -83.8195 )
									ret := -0.894737 // sell
								if( verde_media > -83.8195 )
									ret := -0.167939
							if( stoc > 52.8814 )
								if( xrsi <= 56.2384 )
									ret := 0.689655
								if( xrsi > 56.2384 )
									ret := -0.181818
				if( nvi > 1.76988 )
					if( pvi_ema <= 0.105096 )
						if( media <= 7.83849 )
							if( nvi_ema <= 1.93406 )
								if( nvim <= 1.81968 )
									ret := 0.066667
								if( nvim > 1.81968 )
									ret := 0.741935 // buy
							if( nvi_ema > 1.93406 )
								ret := -1.000000 // sell
						if( media > 7.83849 )
							if( oscp <= 7.59022 )
								if( azul_mean <= -39.232 )
									ret := 0.050847
								if( azul_mean > -39.232 )
									ret := -0.465116
							if( oscp > 7.59022 )
								if( xmf <= 42.7625 )
									ret := 0.200000
								if( xmf > 42.7625 )
									ret := 0.857143 // buy
					if( pvi_ema > 0.105096 )
						if( pvimax <= 0.384133 )
							if( media <= 7.50399 )
								if( source <= 613.698 )
									ret := 0.375000
								if( source > 613.698 )
									ret := -0.785714 // sell
							if( media > 7.50399 )
								if( azul <= -60.9367 )
									ret := -0.111111
								if( azul > -60.9367 )
									ret := -0.821429 // sell
						if( pvimax > 0.384133 )
							if( nvim <= 1.78139 )
								ret := -0.571429
							if( nvim > 1.78139 )
								ret := 1.000000 // buy
			if( azul_mean > -22.8053 )
				if( verde_azul <= -9.33008 )
					if( nvi_ema <= 1.73503 )
						if( pvi_ema <= 0.378266 )
							if( source <= 494.433 )
								if( stoc <= 10.7733 )
									ret := -0.205882
								if( stoc > 10.7733 )
									ret := 0.254613
							if( source > 494.433 )
								if( media_azul <= -8.10809 )
									ret := -0.300000
								if( media_azul > -8.10809 )
									ret := 0.676923
						if( pvi_ema > 0.378266 )
							if( verde_mean <= 3.53197 )
								if( verde_mean <= -60.5916 )
									ret := -0.535714
								if( verde_mean > -60.5916 )
									ret := 0.151376
							if( verde_mean > 3.53197 )
								if( azul_mean <= 52.1134 )
									ret := -0.500000
								if( azul_mean > 52.1134 )
									ret := 0.625000
					if( nvi_ema > 1.73503 )
						if( media <= 26.3614 )
							if( azul <= 5.66974 )
								if( BollOsc <= -35.7413 )
									ret := -0.315217
								if( BollOsc > -35.7413 )
									ret := 0.238095
							if( azul > 5.66974 )
								if( xmf <= 26.5819 )
									ret := -0.648780
								if( xmf > 26.5819 )
									ret := -0.209877
						if( media > 26.3614 )
							if( xmf <= 6.9506 )
								if( marron_mean <= 37.649 )
									ret := -0.285714
								if( marron_mean > 37.649 )
									ret := -0.888889 // sell
							if( xmf > 6.9506 )
								if( nvim <= 1.83085 )
									ret := 0.115299
								if( nvim > 1.83085 )
									ret := -0.360000
				if( verde_azul > -9.33008 )
					if( media_azul <= 76.4415 )
						if( xmf <= 51.9532 )
							if( tprice <= 444.177 )
								if( xrsi <= 54.8622 )
									ret := 0.202822
								if( xrsi > 54.8622 )
									ret := 0.772358 // buy
							if( tprice > 444.177 )
								if( BollOsc <= -48.0737 )
									ret := 0.374486
								if( BollOsc > -48.0737 )
									ret := -0.015114
						if( xmf > 51.9532 )
							if( xmf <= 83.5085 )
								if( nvimax <= 1.73732 )
									ret := 0.194842
								if( nvimax > 1.73732 )
									ret := 0.427406
							if( xmf > 83.5085 )
								if( verde_media <= -25.7581 )
									ret := -0.571429
								if( verde_media > -25.7581 )
									ret := 0.179104
					if( media_azul > 76.4415 )
						if( pvi_ema <= 0.537635 )
							if( azul_mean <= 0.284281 )
								if( azul <= -46.2284 )
									ret := 0.380282
								if( azul > -46.2284 )
									ret := -0.131295
							if( azul_mean > 0.284281 )
								if( verde <= 28.2736 )
									ret := 0.532258
								if( verde > 28.2736 )
									ret := 0.094818
						if( pvi_ema > 0.537635 )
							if( pvimax <= 0.577784 )
								if( media_azul <= 104.281 )
									ret := -0.830189 // sell
								if( media_azul > 104.281 )
									ret := 0.000000
							if( pvimax > 0.577784 )
								ret := 0.000000
	if( verde_media > -3.28701 )
		if( media_azul <= 29.0392 )
			if( azul <= 8.36106 )
				if( tprice <= 665.302 )
					if( source <= 609.714 )
						if( stoc <= 31.5159 )
							if( azul_mean <= -8.76138 )
								if( verde_media <= 5.02723 )
									ret := 0.200000
								if( verde_media > 5.02723 )
									ret := -0.255245
							if( azul_mean > -8.76138 )
								if( stoc <= 20.2878 )
									ret := -0.004662
								if( stoc > 20.2878 )
									ret := 0.281465
						if( stoc > 31.5159 )
							if( xmf <= 23.3378 )
								if( pvimax <= 0.396447 )
									ret := -0.704225 // sell
								if( pvimax > 0.396447 )
									ret := 0.000000
							if( xmf > 23.3378 )
								if( azul_mean <= 1.79845 )
									ret := 0.125000
								if( azul_mean > 1.79845 )
									ret := -0.240876
					if( source > 609.714 )
						if( xmf <= 49.9891 )
							if( verde <= 8.14787 )
								if( source <= 624.771 )
									ret := -1.000000 // sell
								if( source > 624.771 )
									ret := 0.250000
							if( verde > 8.14787 )
								if( nvimax <= 1.70127 )
									ret := 0.105263
								if( nvimax > 1.70127 )
									ret := 0.785714 // buy
						if( xmf > 49.9891 )
							if( nvi_ema <= 1.77605 )
								if( media_azul <= 23.8018 )
									ret := 0.000000
								if( media_azul > 23.8018 )
									ret := -0.500000
							if( nvi_ema > 1.77605 )
								ret := -0.750000 // sell
				if( tprice > 665.302 )
					if( xrsi <= 42.8251 )
						ret := -0.750000 // sell
					if( xrsi > 42.8251 )
						ret := -1.000000 // sell
			if( azul > 8.36106 )
				if( media_azul <= -53.1267 )
					if( pvimax <= 0.432087 )
						if( nvi <= 0.8004 )
							if( nvimax <= 0.175603 )
								ret := -1.000000 // sell
							if( nvimax > 0.175603 )
								if( azul_mean <= 56.4775 )
									ret := -0.250000
								if( azul_mean > 56.4775 )
									ret := 0.111111
						if( nvi > 0.8004 )
							if( marron_mean <= 31.8146 )
								ret := -0.166667
							if( marron_mean > 31.8146 )
								ret := -1.000000 // sell
					if( pvimax > 0.432087 )
						if( verde_azul <= -65.4131 )
							if( marron_mean <= 54.2459 )
								ret := -0.428571
							if( marron_mean > 54.2459 )
								ret := -0.800000 // sell
						if( verde_azul > -65.4131 )
							if( xmf <= 51.1966 )
								if( pvim <= 0.488487 )
									ret := 0.000000
								if( pvim > 0.488487 )
									ret := -0.250000
							if( xmf > 51.1966 )
								ret := 0.666667
				if( media_azul > -53.1267 )
					if( azul_mean <= 37.7431 )
						if( tprice <= 262.514 )
							if( pvim <= 0.154191 )
								if( azul <= 21.6425 )
									ret := 0.190141
								if( azul > 21.6425 )
									ret := -0.301310
							if( pvim > 0.154191 )
								if( nvi <= 0.432506 )
									ret := 0.260870
								if( nvi > 0.432506 )
									ret := -0.562914
						if( tprice > 262.514 )
							if( BollOsc <= 55.3038 )
								if( marron_mean <= 49.9969 )
									ret := -0.067493
								if( marron_mean > 49.9969 )
									ret := -0.251880
							if( BollOsc > 55.3038 )
								if( media_azul <= 6.2424 )
									ret := -0.214286
								if( media_azul > 6.2424 )
									ret := 0.245399
					if( azul_mean > 37.7431 )
						if( verde_mean <= 41.5253 )
							if( source <= 286.661 )
								if( pvimin <= 0.217069 )
									ret := -0.384615
								if( pvimin > 0.217069 )
									ret := 0.100000
							if( source > 286.661 )
								if( pvimin <= 0.423504 )
									ret := 0.561224
								if( pvimin > 0.423504 )
									ret := 0.020000
						if( verde_mean > 41.5253 )
							if( oscp <= 8.67732 )
								if( verde_media <= 26.4785 )
									ret := 0.054913
								if( verde_media > 26.4785 )
									ret := -0.307292
							if( oscp > 8.67732 )
								if( verde <= 132.335 )
									ret := 0.545455
								if( verde > 132.335 )
									ret := -0.047059
		if( media_azul > 29.0392 )
			if( BollOsc <= 46.4631 )
				if( source <= 246.424 )
					if( nvimin <= 0.671205 )
						if( nvimax <= 0.681864 )
							if( nvimax <= 0.530828 )
								if( xmf <= 8.71771 )
									ret := 0.750000 // buy
								if( xmf > 8.71771 )
									ret := 0.044887
							if( nvimax > 0.530828 )
								if( nvim <= 0.535866 )
									ret := 0.484277
								if( nvim > 0.535866 )
									ret := 0.149390
						if( nvimax > 0.681864 )
							if( media <= 96.4232 )
								if( oscp <= -1.9314 )
									ret := 0.034483
								if( oscp > -1.9314 )
									ret := -0.555556
							if( media > 96.4232 )
								ret := 1.000000 // buy
					if( nvimin > 0.671205 )
						if( verde_mean <= 28.007 )
							if( verde <= 21.2444 )
								if( pvi <= 0.158316 )
									ret := 0.947368 // buy
								if( pvi > 0.158316 )
									ret := 0.250000
							if( verde > 21.2444 )
								if( BollOsc <= -22.2954 )
									ret := -0.853659 // sell
								if( BollOsc > -22.2954 )
									ret := -0.244898
						if( verde_mean > 28.007 )
							if( nvi <= 0.790052 )
								if( media <= 82.9979 )
									ret := 0.445679
								if( media > 82.9979 )
									ret := 0.178886
							if( nvi > 0.790052 )
								if( pvim <= 0.061939 )
									ret := 0.650000
								if( pvim > 0.061939 )
									ret := -0.547619
				if( source > 246.424 )
					if( azul <= 21.3953 )
						if( marron_mean <= -4.92089 )
							if( BollOsc <= -37.7964 )
								ret := 0.250000
							if( BollOsc > -37.7964 )
								ret := 1.000000 // buy
						if( marron_mean > -4.92089 )
							if( nvimax <= 0.65011 )
								if( BollOsc <= 34.4603 )
									ret := 0.125000
								if( BollOsc > 34.4603 )
									ret := 0.900000 // buy
							if( nvimax > 0.65011 )
								if( media <= 14.9014 )
									ret := -0.268868
								if( media > 14.9014 )
									ret := 0.015316
					if( azul > 21.3953 )
						if( nvimin <= 0.806359 )
							if( pvi <= 0.24233 )
								if( pvimax <= 0.167737 )
									ret := -0.750000 // sell
								if( pvimax > 0.167737 )
									ret := 0.271429
							if( pvi > 0.24233 )
								if( nvi <= 0.721261 )
									ret := -0.144444
								if( nvi > 0.721261 )
									ret := -0.642857
						if( nvimin > 0.806359 )
							if( source <= 378.313 )
								if( pvi <= 0.30825 )
									ret := 0.447137
								if( pvi > 0.30825 )
									ret := -0.090909
							if( source > 378.313 )
								if( nvimin <= 1.66025 )
									ret := -0.058824
								if( nvimin > 1.66025 )
									ret := 0.213280
			if( BollOsc > 46.4631 )
				if( verde <= 112.514 )
					if( media <= 78.0566 )
						if( pvi_ema <= -0.12611 )
							if( verde_azul <= 92.7223 )
								if( verde_media <= 33.305 )
									ret := 0.428571
								if( verde_media > 33.305 )
									ret := 1.000000 // buy
							if( verde_azul > 92.7223 )
								ret := 0.000000
						if( pvi_ema > -0.12611 )
							if( nvim <= 1.77982 )
								if( xrsi <= 59.3231 )
									ret := -0.288462
								if( xrsi > 59.3231 )
									ret := 0.033981
							if( nvim > 1.77982 )
								if( azul <= 19.4874 )
									ret := -0.866667 // sell
								if( azul > 19.4874 )
									ret := 0.000000
					if( media > 78.0566 )
						if( BollOsc <= 48.7511 )
							if( azul <= 23.9259 )
								if( verde_azul <= 87.6726 )
									ret := -0.633333
								if( verde_azul > 87.6726 )
									ret := -0.086957
							if( azul > 23.9259 )
								if( tprice <= 314.007 )
									ret := -0.294118
								if( tprice > 314.007 )
									ret := 0.456522
						if( BollOsc > 48.7511 )
							if( marron <= 111.844 )
								if( pvim <= 0.635568 )
									ret := -0.478610
								if( pvim > 0.635568 )
									ret := 0.375000
							if( marron > 111.844 )
								if( media_azul <= 62.2752 )
									ret := -0.142857
								if( media_azul > 62.2752 )
									ret := 0.625000
				if( verde > 112.514 )
					if( pvi <= 0.443245 )
						if( verde_azul <= 242.694 )
							if( verde_azul <= 97.937 )
								if( nvimax <= 1.80445 )
									ret := 0.177966
								if( nvimax > 1.80445 )
									ret := 0.818182 // buy
							if( verde_azul > 97.937 )
								if( xmf <= 19.6106 )
									ret := -0.393443
								if( xmf > 19.6106 )
									ret := 0.002148
						if( verde_azul > 242.694 )
							if( tprice <= 153.859 )
								if( nvimin <= 0.202719 )
									ret := 0.200000
								if( nvimin > 0.202719 )
									ret := -1.000000 // sell
							if( tprice > 153.859 )
								if( verde_mean <= 199.222 )
									ret := 0.694444
								if( verde_mean > 199.222 )
									ret := 0.058824
					if( pvi > 0.443245 )
						if( nvimin <= 1.65267 )
							if( verde <= 136.604 )
								if( tprice <= 487.059 )
									ret := 0.064815
								if( tprice > 487.059 )
									ret := -0.574713
							if( verde > 136.604 )
								if( oscp <= 26.0684 )
									ret := 0.385827
								if( oscp > 26.0684 )
									ret := -0.040609
						if( nvimin > 1.65267 )
							if( media_azul <= 91.6456 )
								if( stoc <= 80.9969 )
									ret := -0.492063
								if( stoc > 80.9969 )
									ret := 0.035503
							if( media_azul > 91.6456 )
								if( azul_mean <= -32.4611 )
									ret := 0.200000
								if( azul_mean > -32.4611 )
									ret := -0.607407
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Blai5_Koncorde_v10 
//@version=5
//indicator title="Koncorde v10", shorttitle="Konk_v5", overlay=false)

// Declare variables with explicit types
var float pvi = na
var float nvi = na

tprice = ohlc4
lengthEMA = input.int(255, minval=1)
m = input.int(15)
source = hlc3

// Pececillos
pvi := volume > volume[1] ? nz(pvi[1]) + (close - close[1]) / close[1] : nz(pvi[1])
pvim = ta.ema(pvi, m)
pvimax = ta.highest(pvim, 90)
pvimin = ta.lowest(pvim, 90)
oscp = (pvi - pvim) * 100 / (pvimax - pvimin)

// Tiburones
nvi := volume < volume[1] ? nz(nvi[1]) + (close - close[1]) / close[1] : nz(nvi[1])
nvim = ta.ema(nvi, m)
nvimax = ta.highest(nvim, 90)
nvimin = ta.lowest(nvim, 90)
azul = (nvi - nvim) * 100 / (nvimax - nvimin)

// // Money Flow Index
// Money Flow Index
source_positive = ta.change(source) > 0 ? source : 0
source_negative = ta.change(source) < 0 ? source : 0
upper_s = math.sum(volume * source_positive, 14)
lower_s = math.sum(volume * source_negative, 14)
// Custom Money Flow Index calculation
money_flow_ratio = upper_s / lower_s
xmf = 100 - (100 / (1 + money_flow_ratio))


// Bollinger
mult = input.float(2.0)
basis = ta.sma(tprice, 25)
dev = mult * ta.stdev(tprice, 25)
upper = basis + dev
lower = basis - dev
OB1 = (upper + lower) / 2.0
OB2 = upper - lower
BollOsc = (tprice - OB1) / OB2 * 100

xrsi = ta.rsi(tprice, 14)

// Stochastic Calculation Function
calc_stoch(src, length, smoothFastD) =>
    ll = ta.lowest(low, length)
    hh = ta.highest(high, length)
    k = 100 * (src - ll) / (hh - ll)
    ta.sma(k, smoothFastD)

stoc = calc_stoch(tprice, 21, 3)
marron = (xrsi + xmf + BollOsc + stoc / 3) / 2
verde = marron + oscp
media = ta.ema(marron, m)
bandacero = 0.0

azul_mean = ta.sma(azul, 5)
verde_mean = ta.sma(verde, 5)
marron_mean = ta.sma(marron, 5)
verde_azul = verde - azul
verde_media = verde - media
media_azul = media - azul
media_marron = media - marron
pvi_ema = pvim
nvi_ema = nvi

// PLOT
vl = plot(verde, color=color.new(#66FF66, 0), style=plot.style_area, title="verde")  // GREEN
ml = plot(marron, color=color.new(#FFCC99, 0), style=plot.style_area, title="marron")  // BEIGE
al = plot(azul, color=color.new(#00FFFF, 0), style=plot.style_area, title="azul")  // CYAN
plot(marron, color=color.new(#330000, 0), style=plot.style_line, linewidth=2, title="lmarron")  // DARK RED
plot(verde, color=color.new(#006600, 0), style=plot.style_line, linewidth=2, title="lineav")  // DARK GREEN
plot(azul, color=color.new(#000066, 0), style=plot.style_line, title="lazul")  // DARK BLUE
plot(media, color=color.new(#FF0000, 0), title="media", style=plot.style_line, linewidth=2)  // RED
plot(bandacero, color=color.new(#000000, 0), title="cero")  // BLACK

// EXPLANATION OF THE STRATEGY
//The provided Pine Script implements a trading strategy that includes stop loss (SL) and multiple take profit (TP) levels,
//with an option to activate a trailing stop at the third TP level. Here's a detailed breakdown of its components and functionality:

//Variables Initialization:
var float stop = na
var float limit1 = na
var float limit2 = na

// Converts a percentage to points based on the average position price and the minimum tick size.
percent2points(percent) =>
    strategy.position_avg_price * percent / 100 / syminfo.mintick

// Stop Loss and Take Profit Inputs:
//Defines inputs for stop loss and three take profit levels in percentage terms.
sl = percent2points(input(2.92, title="stop loss %%"))
tp1 = percent2points(input(1.12, title="take profit 1 %%"))
tp2 = percent2points(input(2.31, title="take profit 2 %%"))
tp3 = percent2points(input(3.91, title="take profit 3 %%"))
activateTrailingOnThirdStep = input(false,title="activate trailing on third stage (tp3 is amount, tp2 is offset level)")
log.info("Stop Loss (sl):", sl," Take Profit 1 (tp1):", tp1, " Take Profit 2 (tp2):", tp2," Take Profit 3 (tp3):", tp3)

// Current Profit Calculation:
//Calculates the current profit in points based on the position size and price.
curProfitInPts() =>
    if strategy.position_size > 0
        (high - strategy.position_avg_price) / syminfo.mintick
    else if strategy.position_size < 0
        (strategy.position_avg_price - low) / syminfo.mintick
    else
        0
// Stop Loss and Profit Target Price Calculations:
//Determines the stop loss and profit target prices based on the position size and offset points.
calcStopLossPrice(OffsetPts) =>
    if strategy.position_size > 0
        strategy.position_avg_price - OffsetPts * syminfo.mintick
    else if strategy.position_size < 0
        strategy.position_avg_price + OffsetPts * syminfo.mintick
    else
        0
calcProfitTrgtPrice(OffsetPts) =>
    calcStopLossPrice(-OffsetPts)
// Current Stage Determination:
//Determines the current stage of the trade based on the profit points reached.
getCurrentStage() =>
    var stage = 0
    if strategy.position_size == 0
        stage := 0
    if stage == 0 and strategy.position_size != 0
        stage := 1
    else if stage == 1 and curProfitInPts() >= tp1
        stage := 2
    else if stage == 2 and curProfitInPts() >= tp2
        stage := 3
    stage
stopLevel = -1.
profitLevel = calcProfitTrgtPrice(tp3)

log.info("Stop Level:", stopLevel)
log.info("Profit Level:", profitLevel)
//This part of the strategy sets up exit conditions based on the current stage of the trade and uses the same exit ID "x" to modify the exit parameters dynamically.
//The exit parameters include stop loss, take profit, and comments for each stage.
// based on current stage set up exit
// note: we use same exit ids ("x") consciously, for MODIFY the exit's parameters
curStage = getCurrentStage()
float op_operation = decision_tree_0_ADBE_15Min_65c12d4e(oscp, media, media_azul, verde_media, azul, tprice, azul_mean, verde, nvim, marron, pvimin, pvi, nvimax, verde_mean, xmf, source, stoc, pvimax, nvi_ema, nvi, xrsi, pvim, marron_mean, nvimin, BollOsc, verde_azul, pvi_ema)

log.info("Decision Tree Operation (op_operation):", op_operation)
if (op_operation <= 0)
    if curStage == 1
        stopLevel := calcStopLossPrice(sl)
        strategy.exit("x", loss = sl, profit = tp3, comment = "sl or tp3")
    else if curStage == 2
        stopLevel := calcStopLossPrice(0)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "breakeven or tp3")
    else if curStage == 3
        stopLevel := calcStopLossPrice(-tp1)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "tp1 or tp3")
    else
        strategy.cancel("x")


//SIGNAL MANAGE    User Adjustments and Risk Management
// The user can adjust the threshold values for op_operation to control the level of risk they are willing to take:
// Lower op_operation Threshold for Buy Signal (e.g., 0.5 instead of 0.55):
//     Effect: Generates more buy signals, increasing the frequency of trades. This is suitable for a user willing to take more risks and potentially capture more trading opportunities.
// Higher op_operation Threshold for Buy Signal (e.g., 0.8 instead of 0.55):
//     Effect: Generates fewer buy signals, reducing the frequency of trades. This is suitable for a user seeking to take fewer risks and only enter trades under more favorable conditions.
// Lower op_operation Threshold for Signal Closure (e.g., -0.8 instead of -0.9):
//     Effect: Closes positions less frequently, allowing trades more room to recover from temporary unfavorable conditions. This increases risk but can capture larger gains if the market reverses favorably.
// Higher op_operation Threshold for Signal Closure (e.g., -0.95 instead of -0.9):
//     Effect: Closes positions more frequently, exiting trades quickly at the first sign of unfavorable conditions. This decreases risk but may result in missed opportunities for recovery.
//Signal BUY
FIXED_DOLLAR_AMOUNT  = 10000
positionSize = FIXED_DOLLAR_AMOUNT / close
log.info("Position Size (in dollars $",FIXED_DOLLAR_AMOUNT,"):", positionSize)

if (op_operation >= 0.55)
    stop := close * 0.965
    limit1 := close * 1.03
    limit2 := close * 1.02
    strategy.entry("x", strategy.long, qty=positionSize, stop=stop, comment="in")
//Signal SELL
if (op_operation <= -0.9)
    strategy.close("x", comment = "under Le1")

// Impact on the Dataset
//Stop Loss (SL): Limits the maximum loss by exiting the position if the price moves against the trade by a specified percentage.
//Take Profit (TP1, TP2, TP3): Defines profit-taking levels to secure gains at different stages.
//Trailing Stop: Optionally activates a trailing stop at the third TP level to lock in profits while allowing for further gains if the price continues to move favorably.
//Position Entry and Exit: The strategy's buy and sell signals determine when to enter and exit positions, influencing the dataset by marking the points of trade execution and closure.
//Current Stage Tracking: Monitors the trade's progress through predefined stages, adjusting stop and profit levels accordingly.
//This strategy is designed to manage risk and maximize profits through a structured approach, incorporating multiple exit levels and dynamic adjustments based on market conditions. The dataset will reflect these actions, showing entries, exits, stop loss activations, and profit-taking events, providing valuable information for backtesting and performance analysis.
//Random forest AI offers significant advantages in trading, including the ability to handle large data sets, reduce overfitting and provide more robust predictions through the aggregation of multiple decision trees.

// NOTE: While the Tuisku team stands behind the quality and effectiveness of this trading strategy,
// PLEASE be aware that there is NO GUARANTEE of specific results or profits. TRADING INVOLVES SIGNIFICANT RISK, and it is important to use this strategy with careful consideration of your financial situation and risk tolerance.
// For further information and support, please contact us at Tuisku.eu.


