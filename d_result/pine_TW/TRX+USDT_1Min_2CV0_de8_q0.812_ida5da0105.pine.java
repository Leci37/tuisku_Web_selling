//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Vortex_Indicator
// ID_model: TRXUSDT_1Min_2CV0_a5da0105 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TRXUSDT_1Min_2CV0_a5da0105", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TRXUSDT_1Min_a5da0105(mf, ad, ad_mf, VIP_VIM, VIM, VIP)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( ad_mf <= -0.660843 )
		if( VIP_VIM <= 0.252563 )
			if( VIP_VIM <= -0.255797 )
				if( VIP <= 0.788462 )
					if( mf <= -0.250931 )
						if( ad <= -181586 )
							if( VIP <= 0.681973 )
								if( VIM <= 1.51578 )
									ret := -0.060859
								if( VIM > 1.51578 )
									ret := -0.365517
							if( VIP > 0.681973 )
								if( VIP_VIM <= -0.526373 )
									ret := -0.390428
								if( VIP_VIM > -0.526373 )
									ret := -0.121905
						if( ad > -181586 )
							if( ad_mf <= -178617 )
								if( VIP <= 0.62405 )
									ret := 1.000000 // buy
								if( VIP > 0.62405 )
									ret := 0.777778 // buy
							if( ad_mf > -178617 )
								if( ad <= -16858.6 )
									ret := 0.088775
								if( ad > -16858.6 )
									ret := 0.416667
					if( mf > -0.250931 )
						if( VIP <= 0.448019 )
							if( VIM <= 1.17208 )
								ret := 0.600000
							if( VIM > 1.17208 )
								if( VIM <= 1.44091 )
									ret := -0.352941
								if( VIM > 1.44091 )
									ret := -0.818182 // sell
						if( VIP > 0.448019 )
							if( VIP_VIM <= -0.313272 )
								if( VIM <= 1.23224 )
									ret := 0.010921
								if( VIM > 1.23224 )
									ret := 0.104387
							if( VIP_VIM > -0.313272 )
								if( VIM <= 1.05354 )
									ret := 0.777778 // buy
								if( VIM > 1.05354 )
									ret := 0.304348
				if( VIP > 0.788462 )
					if( VIM <= 1.19205 )
						if( ad_mf <= -260802 )
							if( VIM <= 1.14948 )
								if( ad_mf <= -1.71341e+06 )
									ret := 0.561151
								if( ad_mf > -1.71341e+06 )
									ret := 0.151341
							if( VIM > 1.14948 )
								if( ad_mf <= -3.97108e+06 )
									ret := 0.818182 // buy
								if( ad_mf > -3.97108e+06 )
									ret := 0.032124
						if( ad_mf > -260802 )
							if( VIP <= 0.821101 )
								if( VIP <= 0.820902 )
									ret := 0.158730
								if( VIP > 0.820902 )
									ret := -0.333333
							if( VIP > 0.821101 )
								if( mf <= 0.084387 )
									ret := 0.291721
								if( mf > 0.084387 )
									ret := 0.426979
					if( VIM > 1.19205 )
						if( VIM <= 1.19255 )
							if( ad_mf <= -154491 )
								ret := -0.888889 // sell
							if( ad_mf > -154491 )
								if( ad <= -31248.4 )
									ret := 0.157895
								if( ad > -31248.4 )
									ret := -0.315789
						if( VIM > 1.19255 )
							if( ad_mf <= -163488 )
								if( ad_mf <= -913773 )
									ret := -0.393333
								if( ad_mf > -913773 )
									ret := -0.041968
							if( ad_mf > -163488 )
								if( VIM <= 1.21106 )
									ret := 0.293948
								if( VIM > 1.21106 )
									ret := 0.181476
			if( VIP_VIM > -0.255797 )
				if( ad_mf <= -82935.9 )
					if( VIP <= 0.87395 )
						if( VIM <= 1.08332 )
							if( VIP <= 0.716959 )
								ret := 0.826087 // buy
							if( VIP > 0.716959 )
								if( ad_mf <= -477528 )
									ret := -0.030965
								if( ad_mf > -477528 )
									ret := 0.131579
						if( VIM > 1.08332 )
							if( ad_mf <= -3.07467e+06 )
								ret := -0.411765
							if( ad_mf > -3.07467e+06 )
								if( ad <= -296351 )
									ret := 0.325175
								if( ad > -296351 )
									ret := 0.495208
					if( VIP > 0.87395 )
						if( mf <= 0.103035 )
							if( ad <= -721288 )
								if( ad <= -2.56935e+06 )
									ret := 0.022727
								if( ad > -2.56935e+06 )
									ret := 0.504324
							if( ad > -721288 )
								if( mf <= -0.005743 )
									ret := 0.319951
								if( mf > -0.005743 )
									ret := 0.394332
						if( mf > 0.103035 )
							if( VIP <= 1.05818 )
								if( ad_mf <= -83104.8 )
									ret := 0.514127
								if( ad_mf > -83104.8 )
									ret := -0.900000 // sell
							if( VIP > 1.05818 )
								if( ad_mf <= -321895 )
									ret := 0.517755
								if( ad_mf > -321895 )
									ret := 0.394720
				if( ad_mf > -82935.9 )
					if( VIM <= 0.92866 )
						if( VIP <= 1.0714 )
							if( ad <= -63932.7 )
								if( VIP_VIM <= 0.157214 )
									ret := 0.544118
								if( VIP_VIM > 0.157214 )
									ret := -0.166667
							if( ad > -63932.7 )
								if( ad_mf <= -60247.4 )
									ret := -0.447059
								if( ad_mf > -60247.4 )
									ret := 0.053265
						if( VIP > 1.0714 )
							if( mf <= 0.34595 )
								if( VIP <= 1.12634 )
									ret := 0.348519
								if( VIP > 1.12634 )
									ret := 0.046784
							if( mf > 0.34595 )
								if( VIP <= 1.12485 )
									ret := 0.633588
								if( VIP > 1.12485 )
									ret := 0.371025
					if( VIM > 0.92866 )
						if( VIP <= 1.07141 )
							if( VIP <= 0.933361 )
								if( VIP_VIM <= -0.132308 )
									ret := 0.462751
								if( VIP_VIM > -0.132308 )
									ret := 0.019481
							if( VIP > 0.933361 )
								if( VIM <= 1.07006 )
									ret := 0.605593
								if( VIM > 1.07006 )
									ret := 0.396920
						if( VIP > 1.07141 )
							if( mf <= 0.320194 )
								if( VIM <= 0.969476 )
									ret := 0.290776
								if( VIM > 0.969476 )
									ret := 0.145322
							if( mf > 0.320194 )
								if( VIP <= 1.13284 )
									ret := 0.607287
								if( VIP > 1.13284 )
									ret := 0.279412
		if( VIP_VIM > 0.252563 )
			if( ad <= -471670 )
				if( VIM <= 0.734575 )
					if( ad <= -1.60212e+06 )
						if( ad <= -2.32289e+06 )
							if( ad_mf <= -4.39409e+06 )
								if( ad <= -5.10261e+06 )
									ret := -0.888889 // sell
								if( ad > -5.10261e+06 )
									ret := -0.333333
							if( ad_mf > -4.39409e+06 )
								if( ad_mf <= -2.66026e+06 )
									ret := 0.700000 // buy
								if( ad_mf > -2.66026e+06 )
									ret := 0.909091 // buy
						if( ad > -2.32289e+06 )
							if( VIP_VIM <= 0.521209 )
								ret := -1.000000 // sell
							if( VIP_VIM > 0.521209 )
								if( ad <= -1.7132e+06 )
									ret := -0.352941
								if( ad > -1.7132e+06 )
									ret := -0.913043 // sell
					if( ad > -1.60212e+06 )
						if( VIP <= 1.21154 )
							if( VIM <= 0.600154 )
								ret := 0.571429
							if( VIM > 0.600154 )
								if( VIP <= 1.05733 )
									ret := 0.000000
								if( VIP > 1.05733 )
									ret := -0.385417
						if( VIP > 1.21154 )
							if( mf <= 0.272344 )
								if( VIP <= 1.36416 )
									ret := 0.219895
								if( VIP > 1.36416 )
									ret := 0.733333 // buy
							if( mf > 0.272344 )
								if( mf <= 0.368904 )
									ret := -0.440000
								if( mf > 0.368904 )
									ret := 0.454545
				if( VIM > 0.734575 )
					if( VIM <= 0.841895 )
						if( ad <= -552880 )
							if( VIP_VIM <= 0.471709 )
								if( mf <= 0.089561 )
									ret := 0.309148
								if( mf > 0.089561 )
									ret := 0.024024
							if( VIP_VIM > 0.471709 )
								if( VIM <= 0.760952 )
									ret := 0.563636
								if( VIM > 0.760952 )
									ret := 0.935484 // buy
						if( ad > -552880 )
							if( ad <= -512828 )
								if( VIM <= 0.819076 )
									ret := 0.842105 // buy
								if( VIM > 0.819076 )
									ret := 0.555556
							if( ad > -512828 )
								if( VIP <= 1.17574 )
									ret := 0.253968
								if( VIP > 1.17574 )
									ret := 0.864865 // buy
					if( VIM > 0.841895 )
						if( VIM <= 0.892066 )
							if( mf <= -0.071206 )
								if( ad <= -1.26272e+06 )
									ret := 1.000000 // buy
								if( ad > -1.26272e+06 )
									ret := 0.129032
							if( mf > -0.071206 )
								if( ad <= -518696 )
									ret := 0.587302
								if( ad > -518696 )
									ret := 0.900000 // buy
						if( VIM > 0.892066 )
							if( mf <= 0.225356 )
								ret := -0.117647
							if( mf > 0.225356 )
								ret := 0.333333
			if( ad > -471670 )
				if( mf <= 0.254411 )
					if( ad <= -432764 )
						if( VIP_VIM <= 0.268222 )
							ret := 0.384615
						if( VIP_VIM > 0.268222 )
							if( VIP_VIM <= 0.399744 )
								if( mf <= 0.097207 )
									ret := -0.857143 // sell
								if( mf > 0.097207 )
									ret := -0.555556
							if( VIP_VIM > 0.399744 )
								if( VIP_VIM <= 0.443511 )
									ret := -0.100000
								if( VIP_VIM > 0.443511 )
									ret := -0.612903
					if( ad > -432764 )
						if( ad <= -14134.8 )
							if( VIM <= 0.828956 )
								if( VIP <= 1.21671 )
									ret := -0.035552
								if( VIP > 1.21671 )
									ret := -0.143202
							if( VIM > 0.828956 )
								if( VIM <= 0.840541 )
									ret := 0.212551
								if( VIM > 0.840541 )
									ret := 0.020132
						if( ad > -14134.8 )
							if( VIP <= 1.20655 )
								if( ad_mf <= -12368 )
									ret := 0.585106
								if( ad_mf > -12368 )
									ret := 0.173913
							if( VIP > 1.20655 )
								if( VIM <= 0.854006 )
									ret := 0.006897
								if( VIM > 0.854006 )
									ret := -0.677419
				if( mf > 0.254411 )
					if( VIP <= 1.23084 )
						if( VIM <= 0.859333 )
							if( VIP <= 1.15676 )
								if( ad <= -128066 )
									ret := 0.312500
								if( ad > -128066 )
									ret := -0.068452
							if( VIP > 1.15676 )
								if( VIP_VIM <= 0.358516 )
									ret := 0.301235
								if( VIP_VIM > 0.358516 )
									ret := 0.164780
						if( VIM > 0.859333 )
							if( ad <= -87803.1 )
								if( mf <= 0.281231 )
									ret := -0.210526
								if( mf > 0.281231 )
									ret := 0.633136
							if( ad > -87803.1 )
								if( VIP <= 1.21694 )
									ret := 0.243678
								if( VIP > 1.21694 )
									ret := -0.500000
					if( VIP > 1.23084 )
						if( ad <= -108023 )
							if( VIP_VIM <= 0.501434 )
								if( VIP <= 1.24125 )
									ret := -0.272727
								if( VIP > 1.24125 )
									ret := 0.488095
							if( VIP_VIM > 0.501434 )
								if( VIP_VIM <= 0.521286 )
									ret := -0.450000
								if( VIP_VIM > 0.521286 )
									ret := 0.086614
						if( ad > -108023 )
							if( ad_mf <= -86451.6 )
								if( VIP <= 1.29661 )
									ret := -0.267857
								if( VIP > 1.29661 )
									ret := -0.500000
							if( ad_mf > -86451.6 )
								if( ad_mf <= -56251.8 )
									ret := 0.091912
								if( ad_mf > -56251.8 )
									ret := -0.112565
	if( ad_mf > -0.660843 )
		if( ad_mf <= 0.411108 )
			if( VIP <= 1.18184 )
				if( mf <= 0.522152 )
					if( mf <= 0.324026 )
						if( VIP <= 0.69898 )
							if( ad_mf <= 0.123365 )
								if( VIM <= 1.44067 )
									ret := 0.112613
								if( VIM > 1.44067 )
									ret := -0.600000
							if( ad_mf > 0.123365 )
								if( VIP <= 0.482943 )
									ret := -0.210526
								if( VIP > 0.482943 )
									ret := 0.430730
						if( VIP > 0.69898 )
							if( VIM <= 0.955649 )
								if( ad_mf <= 0.208588 )
									ret := 0.048592
								if( ad_mf > 0.208588 )
									ret := 0.221198
							if( VIM > 0.955649 )
								if( VIP <= 0.888825 )
									ret := -0.065912
								if( VIP > 0.888825 )
									ret := 0.006938
					if( mf > 0.324026 )
						if( mf <= 0.332219 )
							if( VIP_VIM <= 0.062668 )
								if( VIM <= 1.02 )
									ret := 0.722892 // buy
								if( VIM > 1.02 )
									ret := 0.134615
							if( VIP_VIM > 0.062668 )
								if( VIM <= 0.932184 )
									ret := 0.290323
								if( VIM > 0.932184 )
									ret := -0.800000 // sell
						if( mf > 0.332219 )
							if( VIM <= 0.937323 )
								if( mf <= 0.449553 )
									ret := 0.194444
								if( mf > 0.449553 )
									ret := 0.427835
							if( VIM > 0.937323 )
								if( VIP <= 0.796333 )
									ret := -0.553571
								if( VIP > 0.796333 )
									ret := 0.002440
				if( mf > 0.522152 )
					if( VIP <= 1.1717 )
						if( ad_mf <= -0.535542 )
							if( VIP_VIM <= 0.339992 )
								if( VIP_VIM <= 0.223097 )
									ret := -0.131799
								if( VIP_VIM > 0.223097 )
									ret := 0.322581
							if( VIP_VIM > 0.339992 )
								ret := -0.842105 // sell
						if( ad_mf > -0.535542 )
							if( VIP_VIM <= -0.058109 )
								if( VIP_VIM <= -0.181903 )
									ret := -0.300000
								if( VIP_VIM > -0.181903 )
									ret := 0.230769
							if( VIP_VIM > -0.058109 )
								if( VIP_VIM <= 0.062377 )
									ret := -0.851064 // sell
								if( VIP_VIM > 0.062377 )
									ret := -0.193548
					if( VIP > 1.1717 )
						if( ad_mf <= -0.545413 )
							ret := 0.538462
						if( ad_mf > -0.545413 )
							ret := 0.846154 // buy
			if( VIP > 1.18184 )
				if( VIM <= 0.605273 )
					if( ad_mf <= -0.444903 )
						if( ad_mf <= -0.551103 )
							if( VIP <= 1.47565 )
								ret := -0.416667
							if( VIP > 1.47565 )
								ret := -1.000000 // sell
						if( ad_mf > -0.551103 )
							if( VIM <= 0.548067 )
								if( VIM <= 0.440436 )
									ret := -0.800000 // sell
								if( VIM > 0.440436 )
									ret := -0.181818
							if( VIM > 0.548067 )
								ret := -0.720000 // sell
					if( ad_mf > -0.444903 )
						if( mf <= 0.419002 )
							if( VIM <= 0.499125 )
								if( VIM <= 0.461005 )
									ret := 0.150000
								if( VIM > 0.461005 )
									ret := 0.000000
							if( VIM > 0.499125 )
								if( VIP_VIM <= 0.924251 )
									ret := -0.272727
								if( VIP_VIM > 0.924251 )
									ret := -0.588235
						if( mf > 0.419002 )
							if( VIP_VIM <= 1.04695 )
								ret := 0.000000
							if( VIP_VIM > 1.04695 )
								ret := 0.909091 // buy
				if( VIM > 0.605273 )
					if( VIP <= 1.34707 )
						if( VIP <= 1.1846 )
							if( VIP <= 1.1838 )
								if( mf <= 0.117906 )
									ret := -0.714286 // sell
								if( mf > 0.117906 )
									ret := -0.210526
							if( VIP > 1.1838 )
								ret := -0.950000 // sell
						if( VIP > 1.1846 )
							if( VIP <= 1.25602 )
								if( VIP_VIM <= 0.455545 )
									ret := -0.088528
								if( VIP_VIM > 0.455545 )
									ret := -0.256360
							if( VIP > 1.25602 )
								if( VIP_VIM <= 0.529297 )
									ret := 0.256881
								if( VIP_VIM > 0.529297 )
									ret := -0.185915
					if( VIP > 1.34707 )
						if( VIP <= 1.39896 )
							if( VIP <= 1.35096 )
								if( VIM <= 0.67029 )
									ret := 0.954545 // buy
								if( VIM > 0.67029 )
									ret := 0.333333
							if( VIP > 1.35096 )
								if( mf <= 0.270112 )
									ret := 0.475806
								if( mf > 0.270112 )
									ret := 0.190909
						if( VIP > 1.39896 )
							if( ad_mf <= 0.108664 )
								if( mf <= 0.13303 )
									ret := 0.333333
								if( mf > 0.13303 )
									ret := -0.211538
							if( ad_mf > 0.108664 )
								ret := -0.800000 // sell
		if( ad_mf > 0.411108 )
			if( VIP <= 0.875349 )
				if( ad_mf <= 183545 )
					if( VIP <= 0.812773 )
						if( ad <= 1e-06 )
							if( mf <= -0.487248 )
								if( ad_mf <= 0.518145 )
									ret := -0.765625 // sell
								if( ad_mf > 0.518145 )
									ret := -0.405714
							if( mf > -0.487248 )
								if( VIP <= 0.672724 )
									ret := 0.459459
								if( VIP > 0.672724 )
									ret := -0.387879
						if( ad > 1e-06 )
							if( ad <= 175811 )
								if( ad_mf <= 175256 )
									ret := 0.062413
								if( ad_mf > 175256 )
									ret := -0.956522 // sell
							if( ad > 175811 )
								if( ad_mf <= 177559 )
									ret := 0.909091 // buy
								if( ad_mf > 177559 )
									ret := 0.069767
					if( VIP > 0.812773 )
						if( ad_mf <= 893.011 )
							if( VIM <= 1.08069 )
								ret := 0.235294
							if( VIM > 1.08069 )
								if( mf <= -0.574487 )
									ret := -0.729167 // sell
								if( mf > -0.574487 )
									ret := -0.370629
						if( ad_mf > 893.011 )
							if( VIP_VIM <= -0.37032 )
								if( VIP <= 0.821825 )
									ret := -0.128205
								if( VIP > 0.821825 )
									ret := 0.125749
							if( VIP_VIM > -0.37032 )
								if( mf <= -0.336585 )
									ret := -0.272966
								if( mf > -0.336585 )
									ret := -0.102187
				if( ad_mf > 183545 )
					if( VIP_VIM <= -0.349621 )
						if( ad <= 184697 )
							if( ad_mf <= 184157 )
								ret := -0.692308
							if( ad_mf > 184157 )
								if( VIM <= 1.2905 )
									ret := -1.000000 // sell
								if( VIM > 1.2905 )
									ret := -0.909091 // sell
						if( ad > 184697 )
							if( ad <= 2.01849e+06 )
								if( ad_mf <= 1.9989e+06 )
									ret := -0.114029
								if( ad_mf > 1.9989e+06 )
									ret := 1.000000 // buy
							if( ad > 2.01849e+06 )
								if( ad <= 3.12675e+06 )
									ret := -0.641791
								if( ad > 3.12675e+06 )
									ret := 0.157895
					if( VIP_VIM > -0.349621 )
						if( ad_mf <= 3.29427e+06 )
							if( ad_mf <= 1.94133e+06 )
								if( mf <= 0.111539 )
									ret := -0.306818
								if( mf > 0.111539 )
									ret := -0.180000
							if( ad_mf > 1.94133e+06 )
								if( ad_mf <= 2.9708e+06 )
									ret := -0.835821 // sell
								if( ad_mf > 2.9708e+06 )
									ret := -0.304348
						if( ad_mf > 3.29427e+06 )
							if( VIM <= 1.09969 )
								ret := 0.437500
							if( VIM > 1.09969 )
								ret := 1.000000 // buy
			if( VIP > 0.875349 )
				if( ad <= 69153.5 )
					if( VIP <= 1.20611 )
						if( VIM <= 1.06667 )
							if( VIM <= 0.933335 )
								if( VIP <= 1.06693 )
									ret := -0.162231
								if( VIP > 1.06693 )
									ret := -0.364861
							if( VIM > 0.933335 )
								if( VIP_VIM <= 5e-06 )
									ret := -0.380740
								if( VIP_VIM > 5e-06 )
									ret := -0.488262
						if( VIM > 1.06667 )
							if( VIP <= 1.00624 )
								if( VIM <= 1.12496 )
									ret := -0.286311
								if( VIM > 1.12496 )
									ret := -0.126834
							if( VIP > 1.00624 )
								if( VIM <= 1.07987 )
									ret := -0.250000
								if( VIM > 1.07987 )
									ret := 0.204188
					if( VIP > 1.20611 )
						if( VIP <= 1.22445 )
							if( ad_mf <= 61402.2 )
								if( ad <= 52644.4 )
									ret := -0.196660
								if( ad > 52644.4 )
									ret := -0.493976
							if( ad_mf > 61402.2 )
								if( ad <= 63837.7 )
									ret := 0.600000
								if( ad > 63837.7 )
									ret := -0.324324
						if( VIP > 1.22445 )
							if( ad_mf <= 9145.42 )
								if( ad <= 7973.52 )
									ret := -0.263158
								if( ad > 7973.52 )
									ret := -0.578947
							if( ad_mf > 9145.42 )
								if( VIP_VIM <= 0.711616 )
									ret := -0.108382
								if( VIP_VIM > 0.711616 )
									ret := -0.018476
				if( ad > 69153.5 )
					if( ad_mf <= 983624 )
						if( VIM <= 0.838724 )
							if( VIP <= 1.24324 )
								if( ad_mf <= 73793.6 )
									ret := 0.072115
								if( ad_mf > 73793.6 )
									ret := -0.148135
							if( VIP > 1.24324 )
								if( VIP <= 1.43925 )
									ret := -0.018509
								if( VIP > 1.43925 )
									ret := 0.139683
						if( VIM > 0.838724 )
							if( mf <= -0.059633 )
								if( ad <= 219985 )
									ret := -0.236206
								if( ad > 219985 )
									ret := -0.376159
							if( mf > -0.059633 )
								if( VIM <= 1.10482 )
									ret := -0.351946
								if( VIM > 1.10482 )
									ret := -0.157013
					if( ad_mf > 983624 )
						if( VIP_VIM <= -0.083077 )
							if( VIP_VIM <= -0.221385 )
								if( ad <= 1.18304e+06 )
									ret := -0.210526
								if( ad > 1.18304e+06 )
									ret := 0.384615
							if( VIP_VIM > -0.221385 )
								if( VIP <= 0.96658 )
									ret := -0.524008
								if( VIP > 0.96658 )
									ret := 0.100000
						if( VIP_VIM > -0.083077 )
							if( ad_mf <= 5.17356e+06 )
								if( ad_mf <= 987077 )
									ret := 0.823529 // buy
								if( ad_mf > 987077 )
									ret := -0.145792
							if( ad_mf > 5.17356e+06 )
								if( ad <= 7.35695e+06 )
									ret := -0.654545
								if( ad > 7.35695e+06 )
									ret := -1.000000 // sell
	
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

//CODE associated with the technical indicator L_Vortex_Indicator 
//@version=5
//indicator title = "Vortex Indicator", shorttitle="VI", format=format.price, precision=4, timeframe="", timeframe_gaps=true)
period_ = input.int(14, title="Length", minval=2)
VMP = math.sum( math.abs( high - low[1]), period_ )
VMM = math.sum( math.abs( low - high[1]), period_ )
STR = math.sum( ta.atr(1), period_ )
VIP = VMP / STR
VIM = VMM / STR

VIP_VIM = VIP - VIM

plot(VIP, title="VI +", color=#2962FF)
plot(VIM, title="VI -", color=#E91E63)
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
float op_operation = decision_tree_0_TRXUSDT_1Min_a5da0105(mf, ad, ad_mf, VIP_VIM, VIM, VIP)

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


