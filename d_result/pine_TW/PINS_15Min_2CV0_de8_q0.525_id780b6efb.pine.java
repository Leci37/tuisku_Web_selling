//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Vortex_Indicator
// ID_model: PINS_15Min_2CV0_780b6efb Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PINS_15Min_2CV0_780b6efb", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PINS_15Min_780b6efb(mf, ad_mf, ad, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( ad <= 199.983 )
		if( mf <= -0.345019 )
			if( mf <= -0.604064 )
				if( VIM <= 1.47626 )
					if( VIP <= 0.850867 )
						if( VIP_VIM <= -0.616154 )
							if( VIP <= 0.686568 )
								if( VIM <= 1.35638 )
									ret := -0.529412
								if( VIM > 1.35638 )
									ret := 0.400000
							if( VIP > 0.686568 )
								if( VIP <= 0.707322 )
									ret := -0.750000 // sell
								if( VIP > 0.707322 )
									ret := -0.636364
						if( VIP_VIM > -0.616154 )
							if( ad <= -729480 )
								if( VIP_VIM <= -0.525822 )
									ret := 1.000000 // buy
								if( VIP_VIM > -0.525822 )
									ret := 0.482143
							if( ad > -729480 )
								if( VIP <= 0.808308 )
									ret := -0.346154
								if( VIP > 0.808308 )
									ret := 0.212766
					if( VIP > 0.850867 )
						if( mf <= -0.757281 )
							if( VIP_VIM <= 0.041513 )
								if( VIM <= 1.28606 )
									ret := 0.592593
								if( VIM > 1.28606 )
									ret := -0.219512
							if( VIP_VIM > 0.041513 )
								if( VIM <= 1.28945 )
									ret := 0.018868
								if( VIM > 1.28945 )
									ret := -0.555556
						if( mf > -0.757281 )
							if( mf <= -0.736669 )
								if( mf <= -0.749936 )
									ret := -0.476190
								if( mf > -0.749936 )
									ret := -0.888889 // sell
							if( mf > -0.736669 )
								if( VIP <= 1.18356 )
									ret := -0.388128
								if( VIP > 1.18356 )
									ret := 0.040323
				if( VIM > 1.47626 )
					if( ad <= -400067 )
						if( VIP_VIM <= -0.584204 )
							if( ad <= -520758 )
								ret := 1.000000 // buy
							if( ad > -520758 )
								ret := 0.666667
						if( VIP_VIM > -0.584204 )
							ret := 0.333333
					if( ad > -400067 )
						if( ad_mf <= 0.799836 )
							if( VIM <= 2.73016 )
								if( mf <= -0.684062 )
									ret := -0.055556
								if( mf > -0.684062 )
									ret := 0.214286
							if( VIM > 2.73016 )
								if( VIP <= 3.26391 )
									ret := 0.708333 // buy
								if( VIP > 3.26391 )
									ret := 0.078947
						if( ad_mf > 0.799836 )
							if( VIP_VIM <= 0.165664 )
								if( mf <= -0.949948 )
									ret := -0.181818
								if( mf > -0.949948 )
									ret := 0.222222
							if( VIP_VIM > 0.165664 )
								if( VIM <= 2.52962 )
									ret := 0.285714
								if( VIM > 2.52962 )
									ret := 0.875000 // buy
			if( mf > -0.604064 )
				if( ad <= -438678 )
					if( VIM <= 1.13057 )
						if( ad <= -552148 )
							if( VIM <= 1.09532 )
								if( ad <= -2.37622e+06 )
									ret := -0.145833
								if( ad > -2.37622e+06 )
									ret := 0.470588
							if( VIM > 1.09532 )
								if( mf <= -0.390905 )
									ret := -0.684211
								if( mf > -0.390905 )
									ret := -0.300000
						if( ad > -552148 )
							if( VIM <= 0.968987 )
								ret := 0.666667
							if( VIM > 0.968987 )
								if( VIP <= 0.940164 )
									ret := 0.357143
								if( VIP > 0.940164 )
									ret := -0.692308
					if( VIM > 1.13057 )
						if( ad <= -1.27953e+06 )
							if( VIP_VIM <= -0.514697 )
								ret := 0.642857
							if( VIP_VIM > -0.514697 )
								if( mf <= -0.42119 )
									ret := 1.000000 // buy
								if( mf > -0.42119 )
									ret := 0.882353 // buy
						if( ad > -1.27953e+06 )
							if( mf <= -0.56875 )
								if( ad_mf <= -658643 )
									ret := 0.937500 // buy
								if( ad_mf > -658643 )
									ret := 0.714286 // buy
							if( mf > -0.56875 )
								if( ad_mf <= -625642 )
									ret := 0.203390
								if( ad_mf > -625642 )
									ret := 0.562044
				if( ad > -438678 )
					if( ad_mf <= -362596 )
						if( ad <= -400560 )
							if( ad <= -406570 )
								if( VIP_VIM <= -0.103825 )
									ret := -0.904762 // sell
								if( VIP_VIM > -0.103825 )
									ret := -0.071429
							if( ad > -406570 )
								ret := 0.692308
						if( ad > -400560 )
							if( VIM <= 1.18459 )
								if( VIP_VIM <= -0.159884 )
									ret := -0.818182 // sell
								if( VIP_VIM > -0.159884 )
									ret := -0.928571 // sell
							if( VIM > 1.18459 )
								if( ad_mf <= -393823 )
									ret := -1.000000 // sell
								if( ad_mf > -393823 )
									ret := -0.166667
					if( ad_mf > -362596 )
						if( VIP_VIM <= -0.654642 )
							if( mf <= -0.423951 )
								if( VIM <= 1.40531 )
									ret := 0.446429
								if( VIM > 1.40531 )
									ret := 0.157895
							if( mf > -0.423951 )
								if( VIM <= 1.85402 )
									ret := 0.418182
								if( VIM > 1.85402 )
									ret := 0.656716
						if( VIP_VIM > -0.654642 )
							if( VIM <= 1.11786 )
								if( VIM <= 1.08654 )
									ret := 0.216401
								if( VIM > 1.08654 )
									ret := 0.475000
							if( VIM > 1.11786 )
								if( mf <= -0.391652 )
									ret := 0.120341
								if( mf > -0.391652 )
									ret := -0.061617
		if( mf > -0.345019 )
			if( VIP_VIM <= -0.308353 )
				if( mf <= 0.396175 )
					if( VIP_VIM <= -0.634441 )
						if( VIP <= 1.14417 )
							if( ad_mf <= -415177 )
								if( VIP_VIM <= -0.754004 )
									ret := 0.086957
								if( VIP_VIM > -0.754004 )
									ret := -0.500000
							if( ad_mf > -415177 )
								if( ad_mf <= -0.160619 )
									ret := 0.212828
								if( ad_mf > -0.160619 )
									ret := 0.015198
						if( VIP > 1.14417 )
							if( VIM <= 1.94152 )
								if( ad <= -1295.78 )
									ret := -1.000000 // sell
								if( ad > -1295.78 )
									ret := -0.553191
							if( VIM > 1.94152 )
								if( mf <= -0.223489 )
									ret := 0.048077
								if( mf > -0.223489 )
									ret := -0.306849
					if( VIP_VIM > -0.634441 )
						if( ad <= -17991.5 )
							if( VIP <= 0.744167 )
								if( ad_mf <= -1.74081e+06 )
									ret := -0.727273 // sell
								if( ad_mf > -1.74081e+06 )
									ret := 0.192308
							if( VIP > 0.744167 )
								if( VIM <= 1.16728 )
									ret := 0.161692
								if( VIM > 1.16728 )
									ret := -0.018476
						if( ad > -17991.5 )
							if( VIP_VIM <= -0.382301 )
								if( VIM <= 1.39312 )
									ret := 0.045139
								if( VIM > 1.39312 )
									ret := 0.162008
							if( VIP_VIM > -0.382301 )
								if( VIM <= 1.46979 )
									ret := 0.163910
								if( VIM > 1.46979 )
									ret := 0.374502
				if( mf > 0.396175 )
					if( VIP <= 1.40592 )
						if( ad <= -1821.5 )
							if( VIP_VIM <= -0.407824 )
								if( VIM <= 1.5421 )
									ret := -0.166667
								if( VIM > 1.5421 )
									ret := 0.322581
							if( VIP_VIM > -0.407824 )
								if( ad_mf <= -11476 )
									ret := 0.062500
								if( ad_mf > -11476 )
									ret := 0.866667 // buy
						if( ad > -1821.5 )
							if( mf <= 0.581645 )
								if( VIM <= 1.39439 )
									ret := 1.000000 // buy
								if( VIM > 1.39439 )
									ret := 0.779221 // buy
							if( mf > 0.581645 )
								if( ad_mf <= -0.608612 )
									ret := 0.846154 // buy
								if( ad_mf > -0.608612 )
									ret := 0.266667
					if( VIP > 1.40592 )
						if( mf <= 0.449303 )
							if( VIM <= 2.08893 )
								ret := 0.357143
							if( VIM > 2.08893 )
								if( VIP <= 2.3372 )
									ret := 1.000000 // buy
								if( VIP > 2.3372 )
									ret := 0.666667
						if( mf > 0.449303 )
							if( mf <= 0.541278 )
								if( VIM <= 3.03842 )
									ret := -0.450000
								if( VIM > 3.03842 )
									ret := 0.600000
							if( mf > 0.541278 )
								if( ad_mf <= -928.18 )
									ret := 0.100000
								if( ad_mf > -928.18 )
									ret := 0.529412
			if( VIP_VIM > -0.308353 )
				if( mf <= 0.075551 )
					if( ad <= -2.94536e+06 )
						if( ad_mf <= -3.29473e+06 )
							ret := -0.428571
						if( ad_mf > -3.29473e+06 )
							if( ad <= -3.15883e+06 )
								ret := -1.000000 // sell
							if( ad > -3.15883e+06 )
								ret := -0.736842 // sell
					if( ad > -2.94536e+06 )
						if( VIP <= 1.33523 )
							if( ad <= -14214.8 )
								if( VIM <= 1.31733 )
									ret := -0.018255
								if( VIM > 1.31733 )
									ret := -0.458599
							if( ad > -14214.8 )
								if( ad_mf <= -11079.6 )
									ret := 0.341637
								if( ad_mf > -11079.6 )
									ret := 0.043283
						if( VIP > 1.33523 )
							if( VIP_VIM <= -0.233102 )
								if( VIM <= 1.64829 )
									ret := -0.437500
								if( VIM > 1.64829 )
									ret := 0.316239
							if( VIP_VIM > -0.233102 )
								if( VIP_VIM <= 0.855188 )
									ret := -0.111744
								if( VIP_VIM > 0.855188 )
									ret := 0.137931
				if( mf > 0.075551 )
					if( mf <= 0.451291 )
						if( ad <= -256676 )
							if( VIM <= 0.588517 )
								if( VIP <= 1.46012 )
									ret := 0.739130 // buy
								if( VIP > 1.46012 )
									ret := 0.266667
							if( VIM > 0.588517 )
								if( VIP <= 1.43896 )
									ret := -0.093480
								if( VIP > 1.43896 )
									ret := -0.720930 // sell
						if( ad > -256676 )
							if( VIP_VIM <= -0.289246 )
								if( ad_mf <= -134683 )
									ret := -0.333333
								if( ad_mf > -134683 )
									ret := 0.436893
							if( VIP_VIM > -0.289246 )
								if( VIP_VIM <= 1.14096 )
									ret := 0.059232
								if( VIP_VIM > 1.14096 )
									ret := 0.409091
					if( mf > 0.451291 )
						if( ad_mf <= -306.041 )
							if( ad <= -433222 )
								ret := -0.733333 // sell
							if( ad > -433222 )
								if( VIM <= 2.84513 )
									ret := 0.117503
								if( VIM > 2.84513 )
									ret := -0.742857 // sell
						if( ad_mf > -306.041 )
							if( VIP <= 4.42245 )
								if( VIM <= 2.87348 )
									ret := -0.177680
								if( VIM > 2.87348 )
									ret := 0.481481
							if( VIP > 4.42245 )
								if( VIP_VIM <= 0.466721 )
									ret := -0.631579
								if( VIP_VIM > 0.466721 )
									ret := -1.000000 // sell
	if( ad > 199.983 )
		if( VIP <= 1.35041 )
			if( ad <= 27767.6 )
				if( VIM <= 0.979781 )
					if( ad <= 27664.3 )
						if( VIP <= 1.05166 )
							if( ad_mf <= 15086.1 )
								if( mf <= -0.148768 )
									ret := 0.181818
								if( mf > -0.148768 )
									ret := -0.565217
							if( ad_mf > 15086.1 )
								if( ad_mf <= 22577.7 )
									ret := 0.100000
								if( ad_mf > 22577.7 )
									ret := -0.259259
						if( VIP > 1.05166 )
							if( ad <= 1761.87 )
								if( ad <= 280.627 )
									ret := 0.322581
								if( ad > 280.627 )
									ret := -0.121387
							if( ad > 1761.87 )
								if( VIP_VIM <= 0.70628 )
									ret := 0.055113
								if( VIP_VIM > 0.70628 )
									ret := -0.666667
					if( ad > 27664.3 )
						ret := -0.857143 // sell
				if( VIM > 0.979781 )
					if( mf <= -0.021043 )
						if( ad_mf <= 1644.09 )
							if( VIP_VIM <= -0.693345 )
								if( VIM <= 1.75691 )
									ret := 0.704545 // buy
								if( VIM > 1.75691 )
									ret := 0.257143
							if( VIP_VIM > -0.693345 )
								if( ad <= 994.5 )
									ret := -0.063676
								if( ad > 994.5 )
									ret := 0.153333
						if( ad_mf > 1644.09 )
							if( VIP_VIM <= -0.652563 )
								if( VIP_VIM <= -0.703598 )
									ret := -0.220339
								if( VIP_VIM > -0.703598 )
									ret := -0.566038
							if( VIP_VIM > -0.652563 )
								if( VIP_VIM <= 0.050223 )
									ret := -0.098039
								if( VIP_VIM > 0.050223 )
									ret := 0.051051
					if( mf > -0.021043 )
						if( VIP_VIM <= -0.724521 )
							if( mf <= 0.327123 )
								if( VIP <= 1.00666 )
									ret := 0.243902
								if( VIP > 1.00666 )
									ret := -0.375000
							if( mf > 0.327123 )
								if( mf <= 0.43909 )
									ret := 0.888889 // buy
								if( mf > 0.43909 )
									ret := 1.000000 // buy
						if( VIP_VIM > -0.724521 )
							if( ad <= 2220.18 )
								if( VIP <= 1.34892 )
									ret := -0.071479
								if( VIP > 1.34892 )
									ret := 1.000000 // buy
							if( ad > 2220.18 )
								if( VIP <= 1.25606 )
									ret := -0.181425
								if( VIP > 1.25606 )
									ret := -0.410828
			if( ad > 27767.6 )
				if( ad_mf <= 1.50005e+06 )
					if( ad_mf <= 145648 )
						if( ad_mf <= 28232.1 )
							if( ad <= 27998.2 )
								ret := 0.000000
							if( ad > 27998.2 )
								if( VIP <= 1.03372 )
									ret := 0.925926 // buy
								if( VIP > 1.03372 )
									ret := 0.333333
						if( ad_mf > 28232.1 )
							if( VIP_VIM <= -0.112943 )
								if( ad_mf <= 39035.4 )
									ret := 0.203562
								if( ad_mf > 39035.4 )
									ret := 0.071938
							if( VIP_VIM > -0.112943 )
								if( ad_mf <= 140046 )
									ret := 0.010873
								if( ad_mf > 140046 )
									ret := 0.222571
					if( ad_mf > 145648 )
						if( VIP_VIM <= 0.274423 )
							if( ad <= 182299 )
								if( mf <= 0.331243 )
									ret := -0.138340
								if( mf > 0.331243 )
									ret := 0.666667
							if( ad > 182299 )
								if( VIM <= 1.00823 )
									ret := -0.039378
								if( VIM > 1.00823 )
									ret := 0.074823
						if( VIP_VIM > 0.274423 )
							if( ad_mf <= 1.26894e+06 )
								if( ad_mf <= 156338 )
									ret := 0.303030
								if( ad_mf > 156338 )
									ret := -0.140000
							if( ad_mf > 1.26894e+06 )
								if( VIP <= 1.23094 )
									ret := 0.800000 // buy
								if( VIP > 1.23094 )
									ret := 0.583333
				if( ad_mf > 1.50005e+06 )
					if( mf <= 0.73027 )
						if( ad <= 3.16507e+06 )
							if( VIM <= 0.933809 )
								if( ad <= 2.53892e+06 )
									ret := -0.488372
								if( ad > 2.53892e+06 )
									ret := -0.977273 // sell
							if( VIM > 0.933809 )
								if( ad_mf <= 1.80254e+06 )
									ret := -0.642857
								if( ad_mf > 1.80254e+06 )
									ret := -0.131313
						if( ad > 3.16507e+06 )
							if( VIP <= 0.898891 )
								if( VIM <= 1.07743 )
									ret := 1.000000 // buy
								if( VIM > 1.07743 )
									ret := 0.727273 // buy
							if( VIP > 0.898891 )
								if( ad <= 4.57867e+06 )
									ret := -0.057143
								if( ad > 4.57867e+06 )
									ret := 0.516129
					if( mf > 0.73027 )
						if( VIM <= 0.939123 )
							if( VIM <= 0.765147 )
								ret := -0.375000
							if( VIM > 0.765147 )
								ret := 0.789474 // buy
						if( VIM > 0.939123 )
							ret := -0.333333
		if( VIP > 1.35041 )
			if( VIM <= 1.26513 )
				if( ad <= 2715.64 )
					if( ad_mf <= 2214.96 )
						if( ad <= 2096.99 )
							if( ad <= 1346.37 )
								if( mf <= -0.4409 )
									ret := 0.647059
								if( mf > -0.4409 )
									ret := -0.106145
							if( ad > 1346.37 )
								if( VIP <= 1.39517 )
									ret := 0.236842
								if( VIP > 1.39517 )
									ret := -0.511111
						if( ad > 2096.99 )
							if( ad_mf <= 2170.63 )
								ret := 0.833333 // buy
							if( ad_mf > 2170.63 )
								ret := 0.352941
					if( ad_mf > 2214.96 )
						if( ad <= 2551.53 )
							if( VIM <= 0.896344 )
								if( ad_mf <= 2399.8 )
									ret := -0.700000 // sell
								if( ad_mf > 2399.8 )
									ret := -1.000000 // sell
							if( VIM > 0.896344 )
								if( VIP <= 1.51964 )
									ret := -0.400000
								if( VIP > 1.51964 )
									ret := -0.769231 // sell
						if( ad > 2551.53 )
							if( ad <= 2700.45 )
								if( VIP <= 1.42341 )
									ret := 0.545455
								if( VIP > 1.42341 )
									ret := 0.000000
							if( ad > 2700.45 )
								ret := -1.000000 // sell
				if( ad > 2715.64 )
					if( VIP <= 1.44019 )
						if( mf <= -0.008515 )
							if( VIP <= 1.35478 )
								ret := -0.500000
							if( VIP > 1.35478 )
								if( VIP_VIM <= 0.204211 )
									ret := 0.692308
								if( VIP_VIM > 0.204211 )
									ret := 0.144330
						if( mf > -0.008515 )
							if( mf <= 0.041886 )
								if( mf <= 0.00698 )
									ret := -0.300000
								if( mf > 0.00698 )
									ret := -0.771429 // sell
							if( mf > 0.041886 )
								if( ad_mf <= 526498 )
									ret := -0.077970
								if( ad_mf > 526498 )
									ret := -0.415584
					if( VIP > 1.44019 )
						if( ad <= 213136 )
							if( ad <= 141810 )
								if( ad_mf <= 86449.4 )
									ret := 0.022688
								if( ad_mf > 86449.4 )
									ret := 0.371134
							if( ad > 141810 )
								if( ad <= 207551 )
									ret := -0.206522
								if( ad > 207551 )
									ret := -0.833333 // sell
						if( ad > 213136 )
							if( ad_mf <= 248216 )
								if( ad <= 223375 )
									ret := 0.842105 // buy
								if( ad > 223375 )
									ret := 0.535714
							if( ad_mf > 248216 )
								if( VIP <= 1.46886 )
									ret := 0.586957
								if( VIP > 1.46886 )
									ret := 0.040541
			if( VIM > 1.26513 )
				if( mf <= -0.037842 )
					if( ad <= 1019.85 )
						if( VIP_VIM <= -0.307173 )
							if( ad_mf <= 844.947 )
								if( ad <= 826.306 )
									ret := 0.093750
								if( ad > 826.306 )
									ret := 0.800000 // buy
							if( ad_mf > 844.947 )
								if( mf <= -0.287697 )
									ret := -1.000000 // sell
								if( mf > -0.287697 )
									ret := -0.600000
						if( VIP_VIM > -0.307173 )
							if( ad_mf <= 848.044 )
								if( VIP_VIM <= -0.251658 )
									ret := -1.000000 // sell
								if( VIP_VIM > -0.251658 )
									ret := -0.355987
							if( ad_mf > 848.044 )
								if( VIP <= 1.89589 )
									ret := -0.916667 // sell
								if( VIP > 1.89589 )
									ret := -0.583333
					if( ad > 1019.85 )
						if( VIM <= 1.66351 )
							if( VIP_VIM <= 0.420477 )
								if( ad_mf <= 161150 )
									ret := -0.205882
								if( ad_mf > 161150 )
									ret := 0.718750 // buy
							if( VIP_VIM > 0.420477 )
								if( VIP_VIM <= 0.650172 )
									ret := -0.739130 // sell
								if( VIP_VIM > 0.650172 )
									ret := 0.307692
						if( VIM > 1.66351 )
							if( VIP <= 3.84162 )
								if( ad_mf <= 1052.75 )
									ret := 0.850000 // buy
								if( ad_mf > 1052.75 )
									ret := 0.148087
							if( VIP > 3.84162 )
								if( ad_mf <= 2424.49 )
									ret := -0.611111
								if( ad_mf > 2424.49 )
									ret := -0.333333
				if( mf > -0.037842 )
					if( ad <= 365982 )
						if( ad <= 750.045 )
							if( VIP_VIM <= -0.420225 )
								if( ad <= 517.823 )
									ret := -0.136364
								if( ad > 517.823 )
									ret := 0.406250
							if( VIP_VIM > -0.420225 )
								if( VIP_VIM <= 0.441702 )
									ret := -0.556150
								if( VIP_VIM > 0.441702 )
									ret := -0.183673
						if( ad > 750.045 )
							if( mf <= -0.020409 )
								if( VIP <= 2.58936 )
									ret := -0.551724
								if( VIP > 2.58936 )
									ret := -1.000000 // sell
							if( mf > -0.020409 )
								if( VIM <= 1.98901 )
									ret := -0.222222
								if( VIM > 1.98901 )
									ret := -0.079699
					if( ad > 365982 )
						if( ad_mf <= 448944 )
							ret := 0.555556
						if( ad_mf > 448944 )
							ret := 1.000000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_PINS_15Min_780b6efb(mf, ad_mf, ad, VIP, VIP_VIM, VIM)

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


