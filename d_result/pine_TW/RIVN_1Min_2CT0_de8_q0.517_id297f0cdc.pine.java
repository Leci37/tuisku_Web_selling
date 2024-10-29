//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Triple_EMA
// ID_model: RIVN_1Min_2CT0_297f0cdc Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_RIVN_1Min_2CT0_297f0cdc", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_RIVN_1Min_297f0cdc(mf, ad, ad_mf, ema1, tema, ema12, ema2, ema3, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( ad_mf <= -200.142 )
		if( tema <= 11.2521 )
			if( ad <= -1609.7 )
				if( ema13 <= -0.057761 )
					if( ad_mf <= -389409 )
						if( ad <= -545251 )
							if( ema3 <= 10.9197 )
								ret := 0.100000
							if( ema3 > 10.9197 )
								ret := -0.785714 // sell
						if( ad > -545251 )
							if( ema12 <= -0.048535 )
								ret := -1.000000 // sell
							if( ema12 > -0.048535 )
								ret := -0.875000 // sell
					if( ad_mf > -389409 )
						if( ema13 <= -0.199584 )
							ret := 0.900000 // buy
						if( ema13 > -0.199584 )
							if( ema2 <= 11.3243 )
								if( ad <= -89320.7 )
									ret := -0.376712
								if( ad > -89320.7 )
									ret := -0.050704
							if( ema2 > 11.3243 )
								ret := 0.692308
				if( ema13 > -0.057761 )
					if( ema3 <= 10.178 )
						if( ema12 <= -0.017445 )
							if( ema13 <= -0.026205 )
								if( tema <= 9.96944 )
									ret := -0.058824
								if( tema > 9.96944 )
									ret := 0.285714
							if( ema13 > -0.026205 )
								if( ad_mf <= -98143 )
									ret := -0.833333 // sell
								if( ad_mf > -98143 )
									ret := -0.666667
						if( ema12 > -0.017445 )
							if( ema2 <= 10.1727 )
								if( ema2 <= 9.08836 )
									ret := 0.163609
								if( ema2 > 9.08836 )
									ret := 0.221510
							if( ema2 > 10.1727 )
								if( ad_mf <= -20657.1 )
									ret := 0.766667 // buy
								if( ad_mf > -20657.1 )
									ret := 0.350000
					if( ema3 > 10.178 )
						if( ad <= -2224.13 )
							if( ad_mf <= -18702.4 )
								if( ema12 <= 0.070131 )
									ret := 0.060043
								if( ema12 > 0.070131 )
									ret := -0.692308
							if( ad_mf > -18702.4 )
								if( ad <= -2540.96 )
									ret := 0.153163
								if( ad > -2540.96 )
									ret := 0.441718
						if( ad > -2224.13 )
							if( ad <= -2195.56 )
								if( ema13 <= -0.006026 )
									ret := -0.928571 // sell
								if( ema13 > -0.006026 )
									ret := -0.666667
							if( ad > -2195.56 )
								if( ema13 <= -0.003604 )
									ret := 0.179688
								if( ema13 > -0.003604 )
									ret := -0.263514
			if( ad > -1609.7 )
				if( mf <= 0.160768 )
					if( ad <= -1188.83 )
						if( ema13 <= -0.01627 )
							if( ad_mf <= -1300.82 )
								if( ema13 <= -0.0293 )
									ret := 0.800000 // buy
								if( ema13 > -0.0293 )
									ret := 1.000000 // buy
							if( ad_mf > -1300.82 )
								if( ad_mf <= -1269.41 )
									ret := 0.000000
								if( ad_mf > -1269.41 )
									ret := 0.862069 // buy
						if( ema13 > -0.01627 )
							if( mf <= -0.279794 )
								if( ad_mf <= -1313.55 )
									ret := -0.096774
								if( ad_mf > -1313.55 )
									ret := 0.461538
							if( mf > -0.279794 )
								if( ad_mf <= -1557.17 )
									ret := 0.000000
								if( ad_mf > -1557.17 )
									ret := 0.538922
					if( ad > -1188.83 )
						if( ad <= -1012.05 )
							if( ema3 <= 10.5505 )
								if( mf <= -0.383806 )
									ret := -0.666667
								if( mf > -0.383806 )
									ret := 0.055556
							if( ema3 > 10.5505 )
								if( ad_mf <= -1079.8 )
									ret := 0.655172
								if( ad_mf > -1079.8 )
									ret := -0.037037
						if( ad > -1012.05 )
							if( ad <= -495.61 )
								if( ema1 <= 10.123 )
									ret := 0.634409
								if( ema1 > 10.123 )
									ret := 0.399491
							if( ad > -495.61 )
								if( ad <= -272.007 )
									ret := 0.121212
								if( ad > -272.007 )
									ret := 0.600000
				if( mf > 0.160768 )
					if( ema12 <= -0.009307 )
						ret := 0.785714 // buy
					if( ema12 > -0.009307 )
						if( ad <= -1187.71 )
							if( tema <= 10.4357 )
								if( ad_mf <= -1273.15 )
									ret := -0.057692
								if( ad_mf > -1273.15 )
									ret := 0.769231 // buy
							if( tema > 10.4357 )
								if( ad_mf <= -1419.84 )
									ret := 0.333333
								if( ad_mf > -1419.84 )
									ret := 0.692308
						if( ad > -1187.71 )
							if( ema12 <= 0.01139 )
								if( tema <= 9.59383 )
									ret := 0.380952
								if( tema > 9.59383 )
									ret := -0.013100
							if( ema12 > 0.01139 )
								if( tema <= 10.0859 )
									ret := -0.909091 // sell
								if( tema > 10.0859 )
									ret := -0.187500
		if( tema > 11.2521 )
			if( ad_mf <= -9086.11 )
				if( mf <= -0.04925 )
					if( ema3 <= 15.1063 )
						if( mf <= -0.050004 )
							if( mf <= -0.304146 )
								if( ema12 <= -0.003795 )
									ret := 0.068517
								if( ema12 > -0.003795 )
									ret := 0.412121
							if( mf > -0.304146 )
								if( ad <= -9776.21 )
									ret := 0.007931
								if( ad > -9776.21 )
									ret := -0.525424
						if( mf > -0.050004 )
							if( ema13 <= -0.00806 )
								ret := 0.181818
							if( ema13 > -0.00806 )
								ret := 0.846154 // buy
					if( ema3 > 15.1063 )
						if( ema13 <= 0.005587 )
							if( ema13 <= -0.051831 )
								if( ad <= -20334.8 )
									ret := 0.017287
								if( ad > -20334.8 )
									ret := 0.380000
							if( ema13 > -0.051831 )
								if( ema12 <= -0.016405 )
									ret := 0.402010
								if( ema12 > -0.016405 )
									ret := 0.119774
						if( ema13 > 0.005587 )
							if( ema2 <= 15.3399 )
								if( ema3 <= 15.1967 )
									ret := 0.000000
								if( ema3 > 15.1967 )
									ret := 1.000000 // buy
							if( ema2 > 15.3399 )
								if( ema1 <= 15.7162 )
									ret := -0.589286
								if( ema1 > 15.7162 )
									ret := -0.052846
				if( mf > -0.04925 )
					if( tema <= 18.3204 )
						if( ad <= -226566 )
							if( ema3 <= 14.2124 )
								if( ema12 <= 0.070593 )
									ret := -0.023529
								if( ema12 > 0.070593 )
									ret := 0.777778 // buy
							if( ema3 > 14.2124 )
								if( ad_mf <= -497914 )
									ret := -0.840909 // sell
								if( ad_mf > -497914 )
									ret := -0.360153
						if( ad > -226566 )
							if( ema13 <= 0.243656 )
								if( ema12 <= -0.035805 )
									ret := 0.322917
								if( ema12 > -0.035805 )
									ret := -0.022908
							if( ema13 > 0.243656 )
								if( ad_mf <= -104901 )
									ret := 0.500000
								if( ad_mf > -104901 )
									ret := 0.875000 // buy
					if( tema > 18.3204 )
						if( mf <= 0.110047 )
							if( mf <= 0.015262 )
								ret := -0.629630
							if( mf > 0.015262 )
								if( ema13 <= 0.019983 )
									ret := 0.142857
								if( ema13 > 0.019983 )
									ret := 0.538462
						if( mf > 0.110047 )
							if( mf <= 0.143194 )
								ret := -1.000000 // sell
							if( mf > 0.143194 )
								if( ema1 <= 18.4481 )
									ret := -0.555556
								if( ema1 > 18.4481 )
									ret := -0.875000 // sell
			if( ad_mf > -9086.11 )
				if( ema1 <= 12.8811 )
					if( ema12 <= 0.035809 )
						if( ema13 <= -0.04713 )
							if( ad_mf <= -2209.78 )
								if( ema13 <= -0.054874 )
									ret := -0.916667 // sell
								if( ema13 > -0.054874 )
									ret := -0.705882 // sell
							if( ad_mf > -2209.78 )
								if( ema2 <= 12.3806 )
									ret := 0.571429
								if( ema2 > 12.3806 )
									ret := -0.800000 // sell
						if( ema13 > -0.04713 )
							if( ema13 <= 0.011881 )
								if( tema <= 12.0378 )
									ret := 0.228880
								if( tema > 12.0378 )
									ret := 0.428571
							if( ema13 > 0.011881 )
								if( ad <= -2721.52 )
									ret := 0.195122
								if( ad > -2721.52 )
									ret := -0.101523
					if( ema12 > 0.035809 )
						if( ema13 <= 0.090158 )
							ret := -1.000000 // sell
						if( ema13 > 0.090158 )
							ret := -0.636364
				if( ema1 > 12.8811 )
					if( ema13 <= 0.037389 )
						if( tema <= 16.2869 )
							if( ad <= -8982.64 )
								if( ema13 <= -0.015526 )
									ret := 1.000000 // buy
								if( ema13 > -0.015526 )
									ret := 0.777778 // buy
							if( ad > -8982.64 )
								if( ema12 <= -0.007706 )
									ret := 0.196156
								if( ema12 > -0.007706 )
									ret := 0.050532
						if( tema > 16.2869 )
							if( ema12 <= -0.047403 )
								ret := 0.684211
							if( ema12 > -0.047403 )
								if( tema <= 16.3032 )
									ret := -0.428571
								if( tema > 16.3032 )
									ret := 0.012451
					if( ema13 > 0.037389 )
						if( tema <= 13.655 )
							if( tema <= 13.2414 )
								if( ema3 <= 12.9023 )
									ret := -0.733333 // sell
								if( ema3 > 12.9023 )
									ret := 0.038462
							if( tema > 13.2414 )
								if( mf <= 0.204717 )
									ret := -0.648148
								if( mf > 0.204717 )
									ret := -0.190476
						if( tema > 13.655 )
							if( ema2 <= 13.8486 )
								if( mf <= -0.006647 )
									ret := -0.444444
								if( mf > -0.006647 )
									ret := 0.391304
							if( ema2 > 13.8486 )
								if( ad_mf <= -516.889 )
									ret := -0.314286
								if( ad_mf > -516.889 )
									ret := 0.560000
	if( ad_mf > -200.142 )
		if( ema12 <= 0.001679 )
			if( ad_mf <= 313.121 )
				if( ema12 <= -0.003881 )
					if( mf <= 0.086953 )
						if( ema1 <= 13.3064 )
							if( ema1 <= 11.6818 )
								if( ema13 <= -0.048536 )
									ret := -0.192090
								if( ema13 > -0.048536 )
									ret := 0.077620
							if( ema1 > 11.6818 )
								if( tema <= 11.7112 )
									ret := 0.910714 // buy
								if( tema > 11.7112 )
									ret := 0.216702
						if( ema1 > 13.3064 )
							if( ema2 <= 15.2259 )
								if( ema3 <= 14.8553 )
									ret := -0.053640
								if( ema3 > 14.8553 )
									ret := -0.364754
							if( ema2 > 15.2259 )
								if( ema3 <= 15.9003 )
									ret := 0.654545
								if( ema3 > 15.9003 )
									ret := 0.095830
					if( mf > 0.086953 )
						if( ema1 <= 9.26849 )
							if( ema12 <= -0.007317 )
								if( ema12 <= -0.01547 )
									ret := 0.222222
								if( ema12 > -0.01547 )
									ret := 0.759259 // buy
							if( ema12 > -0.007317 )
								if( ema3 <= 8.72457 )
									ret := 0.125000
								if( ema3 > 8.72457 )
									ret := 0.432432
						if( ema1 > 9.26849 )
							if( mf <= 0.598228 )
								if( ema3 <= 13.1825 )
									ret := 0.108029
								if( ema3 > 13.1825 )
									ret := 0.317881
							if( mf > 0.598228 )
								if( tema <= 13.6853 )
									ret := 0.085106
								if( tema > 13.6853 )
									ret := -0.469388
				if( ema12 > -0.003881 )
					if( ema13 <= 0.009327 )
						if( ema12 <= -0.000272 )
							if( ema3 <= 10.2016 )
								if( ema13 <= -0.002161 )
									ret := 0.097134
								if( ema13 > -0.002161 )
									ret := 0.256477
							if( ema3 > 10.2016 )
								if( ema3 <= 13.6636 )
									ret := 0.030928
								if( ema3 > 13.6636 )
									ret := -0.063813
						if( ema12 > -0.000272 )
							if( ema2 <= 8.69768 )
								if( tema <= 8.62716 )
									ret := 0.040000
								if( tema > 8.62716 )
									ret := -0.590909
							if( ema2 > 8.69768 )
								if( ema1 <= 8.74334 )
									ret := 0.254902
								if( ema1 > 8.74334 )
									ret := -0.035302
					if( ema13 > 0.009327 )
						if( ema2 <= 13.7743 )
							if( tema <= 10.1247 )
								ret := -0.111111
							if( tema > 10.1247 )
								if( mf <= 0.025504 )
									ret := 0.125000
								if( mf > 0.025504 )
									ret := 0.931034 // buy
						if( ema2 > 13.7743 )
							if( ema3 <= 16.5002 )
								ret := 0.000000
							if( ema3 > 16.5002 )
								ret := 0.222222
			if( ad_mf > 313.121 )
				if( ema1 <= 12.9902 )
					if( ema1 <= 10.5616 )
						if( mf <= -0.111314 )
							if( ad_mf <= 52666.7 )
								if( ema1 <= 8.764 )
									ret := -0.382353
								if( ema1 > 8.764 )
									ret := 0.003439
							if( ad_mf > 52666.7 )
								if( ad_mf <= 59614.6 )
									ret := -0.650000
								if( ad_mf > 59614.6 )
									ret := -0.233577
						if( mf > -0.111314 )
							if( ema12 <= -0.011834 )
								if( tema <= 9.27538 )
									ret := 0.469880
								if( tema > 9.27538 )
									ret := 0.131183
							if( ema12 > -0.011834 )
								if( mf <= -0.098954 )
									ret := 0.325301
								if( mf > -0.098954 )
									ret := -0.013964
					if( ema1 > 10.5616 )
						if( ema12 <= -0.040748 )
							if( ema12 <= -0.09822 )
								if( ema2 <= 11.0632 )
									ret := -0.411765
								if( ema2 > 11.0632 )
									ret := 1.000000 // buy
							if( ema12 > -0.09822 )
								if( tema <= 12.6115 )
									ret := -0.552239
								if( tema > 12.6115 )
									ret := -0.200000
						if( ema12 > -0.040748 )
							if( ema2 <= 11.7225 )
								if( ema12 <= -0.001904 )
									ret := -0.185075
								if( ema12 > -0.001904 )
									ret := -0.050052
							if( ema2 > 11.7225 )
								if( ema13 <= -0.067016 )
									ret := -0.642857
								if( ema13 > -0.067016 )
									ret := -0.040293
				if( ema1 > 12.9902 )
					if( ema12 <= -0.033829 )
						if( ema1 <= 15.5361 )
							if( ema13 <= -0.303801 )
								ret := 1.000000 // buy
							if( ema13 > -0.303801 )
								if( ad <= 6587.1 )
									ret := 0.519737
								if( ad > 6587.1 )
									ret := 0.150066
						if( ema1 > 15.5361 )
							if( ema12 <= -0.144263 )
								if( tema <= 16.1386 )
									ret := -0.136364
								if( tema > 16.1386 )
									ret := -0.900000 // sell
							if( ema12 > -0.144263 )
								if( mf <= 0.074052 )
									ret := 0.023256
								if( mf > 0.074052 )
									ret := -0.422222
					if( ema12 > -0.033829 )
						if( ad_mf <= 349.153 )
							if( ema13 <= -0.007275 )
								if( ema12 <= -0.005931 )
									ret := -0.619048
								if( ema12 > -0.005931 )
									ret := -1.000000 // sell
							if( ema13 > -0.007275 )
								ret := -0.176471
						if( ad_mf > 349.153 )
							if( ad_mf <= 410.169 )
								if( ema1 <= 13.7842 )
									ret := -0.181818
								if( ema1 > 13.7842 )
									ret := 0.705882 // buy
							if( ad_mf > 410.169 )
								if( ad <= 416.595 )
									ret := -0.947368 // sell
								if( ad > 416.595 )
									ret := -0.044087
		if( ema12 > 0.001679 )
			if( ad <= 15161.6 )
				if( ema1 <= 13.5791 )
					if( ema1 <= 13.5634 )
						if( ema1 <= 10.4441 )
							if( ema1 <= 10.3914 )
								if( ad_mf <= -0.69132 )
									ret := 0.368421
								if( ad_mf > -0.69132 )
									ret := -0.128641
							if( ema1 > 10.3914 )
								if( ema13 <= 0.025468 )
									ret := 0.106849
								if( ema13 > 0.025468 )
									ret := 0.851852 // buy
						if( ema1 > 10.4441 )
							if( ema12 <= 0.013752 )
								if( tema <= 12.1007 )
									ret := -0.210340
								if( tema > 12.1007 )
									ret := -0.054778
							if( ema12 > 0.013752 )
								if( ad <= 10703.6 )
									ret := -0.224891
								if( ad > 10703.6 )
									ret := -0.582569
					if( ema1 > 13.5634 )
						if( ema3 <= 13.5618 )
							if( ema12 <= 0.015015 )
								if( ema1 <= 13.565 )
									ret := -0.777778 // sell
								if( ema1 > 13.565 )
									ret := -1.000000 // sell
							if( ema12 > 0.015015 )
								ret := -0.545455
						if( ema3 > 13.5618 )
							ret := -0.357143
				if( ema1 > 13.5791 )
					if( ad_mf <= -12.8508 )
						if( mf <= 0.146421 )
							ret := -0.437500
						if( mf > 0.146421 )
							ret := -0.950000 // sell
					if( ad_mf > -12.8508 )
						if( ema3 <= 16.7092 )
							if( ad <= 15095.2 )
								if( ema13 <= 0.129712 )
									ret := -0.026897
								if( ema13 > 0.129712 )
									ret := -0.338462
							if( ad > 15095.2 )
								ret := -0.800000 // sell
						if( ema3 > 16.7092 )
							if( ema2 <= 16.8655 )
								if( mf <= -0.06985 )
									ret := 0.062500
								if( mf > -0.06985 )
									ret := -0.583333
							if( ema2 > 16.8655 )
								if( ema3 <= 16.8951 )
									ret := 0.485714
								if( ema3 > 16.8951 )
									ret := -0.109696
			if( ad > 15161.6 )
				if( ad_mf <= 145527 )
					if( ad <= 15222.3 )
						if( mf <= 0.077514 )
							ret := 1.000000 // buy
						if( mf > 0.077514 )
							ret := 0.125000
					if( ad > 15222.3 )
						if( ad_mf <= 144111 )
							if( ema2 <= 13.8093 )
								if( ad <= 48245 )
									ret := 0.037852
								if( ad > 48245 )
									ret := -0.035956
							if( ema2 > 13.8093 )
								if( tema <= 13.992 )
									ret := -0.211480
								if( tema > 13.992 )
									ret := -0.046015
						if( ad_mf > 144111 )
							if( ema12 <= 0.015795 )
								ret := 0.090909
							if( ema12 > 0.015795 )
								ret := 0.760000 // buy
				if( ad_mf > 145527 )
					if( ema3 <= 13.0637 )
						if( ema13 <= 0.202876 )
							if( mf <= 0.010254 )
								if( ad <= 250687 )
									ret := 0.534884
								if( ad > 250687 )
									ret := -0.520000
							if( mf > 0.010254 )
								if( ema2 <= 10.3667 )
									ret := -0.177686
								if( ema2 > 10.3667 )
									ret := -0.490694
						if( ema13 > 0.202876 )
							if( ad <= 849054 )
								ret := -0.052632
							if( ad > 849054 )
								ret := 0.857143 // buy
					if( ema3 > 13.0637 )
						if( ad_mf <= 195674 )
							if( mf <= 0.316706 )
								if( ad_mf <= 153830 )
									ret := -0.750000 // sell
								if( ad_mf > 153830 )
									ret := -0.300000
							if( mf > 0.316706 )
								if( ema3 <= 13.8136 )
									ret := 0.750000 // buy
								if( ema3 > 13.8136 )
									ret := -0.125000
						if( ad_mf > 195674 )
							if( mf <= 0.399405 )
								if( ema13 <= 0.073192 )
									ret := -0.033639
								if( ema13 > 0.073192 )
									ret := 0.277523
							if( mf > 0.399405 )
								if( ema2 <= 17.2469 )
									ret := -0.263158
								if( ema2 > 17.2469 )
									ret := 0.444444
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Chaikin_Money_Flow 
 //@version=5
//indicator title="Chaikin Money Flow", shorttitle="CMF", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
var cumVol = 0.
cumVol += nz(volume)
if barstate.islast and cumVol == 0
    runtime.error("No volume is provided by the data vendor.")
length_CMF = input.int(20, minval=1)
ad = close==high and close==low or high==low ? 0 : ((2*close-low-high)/(high-low))*volume
mf = math.sum(ad, length_CMF) / math.sum(volume, length_CMF)
plot(mf, color=#43A047, title="MF")
hline(0, color=#787B86, title="Zero", linestyle=hline.style_dashed)


ad_mf = ad - mf

//CODE associated with the technical indicator L_Triple_EMA 
//@version=5
//indicator title="Triple EMA", shorttitle="TEMA", overlay=true, timeframe="", timeframe_gaps=true)
length_TEMA = input.int(9, minval=1)
ema1 = ta.ema(close, length_TEMA)
ema2 = ta.ema(ema1, length_TEMA)
ema3 = ta.ema(ema2, length_TEMA)
tema = 3 * (ema1 - ema2) + ema3
plot(tema, "TEMA", color=#2962FF)

ema12 = ema1 - ema2
ema13 = ema1 - ema3


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
float op_operation = decision_tree_0_RIVN_1Min_297f0cdc(mf, ad, ad_mf, ema1, tema, ema12, ema2, ema3, ema13)

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


