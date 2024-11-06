//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Vortex_Indicator
// ID_model: CRWD_15Min_2CV0_6d135d4f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_CRWD_15Min_2CV0_6d135d4f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_CRWD_15Min_6d135d4f(mf, ad_mf, ad, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ad_mf <= 589.922 )
		if( ad <= -6731.61 )
			if( ad_mf <= -112316 )
				if( ad <= -208196 )
					if( ad_mf <= -246999 )
						if( ad_mf <= -264638 )
							if( ad <= -273583 )
								if( ad_mf <= -1.4551e+06 )
									ret := -0.454545
								if( ad_mf > -1.4551e+06 )
									ret := 0.078871
							if( ad > -273583 )
								if( ad <= -270595 )
									ret := -0.650000
								if( ad > -270595 )
									ret := -0.096774
						if( ad_mf > -264638 )
							if( VIM <= 1.60984 )
								if( VIP <= 1.20196 )
									ret := 0.405797
								if( VIP > 1.20196 )
									ret := -0.222222
							if( VIM > 1.60984 )
								ret := -1.000000 // sell
					if( ad_mf > -246999 )
						if( ad_mf <= -241968 )
							if( mf <= -0.179865 )
								if( VIP <= 0.841624 )
									ret := 0.875000 // buy
								if( VIP > 0.841624 )
									ret := -0.545455
							if( mf > -0.179865 )
								if( VIM <= 0.810983 )
									ret := -1.000000 // sell
								if( VIM > 0.810983 )
									ret := -0.727273 // sell
						if( ad_mf > -241968 )
							if( VIM <= 1.25252 )
								if( ad <= -238717 )
									ret := 0.432432
								if( ad > -238717 )
									ret := -0.063218
							if( VIM > 1.25252 )
								if( VIP_VIM <= -0.359538 )
									ret := -0.190476
								if( VIP_VIM > -0.359538 )
									ret := -0.909091 // sell
				if( ad > -208196 )
					if( mf <= -0.398799 )
						if( ad_mf <= -179301 )
							if( ad <= -181553 )
								if( ad <= -181873 )
									ret := 0.539326
								if( ad > -181873 )
									ret := -1.000000 // sell
							if( ad > -181553 )
								if( VIP_VIM <= -0.751725 )
									ret := 0.800000 // buy
								if( VIP_VIM > -0.751725 )
									ret := 1.000000 // buy
						if( ad_mf > -179301 )
							if( mf <= -0.629934 )
								if( ad <= -135571 )
									ret := -0.513514
								if( ad > -135571 )
									ret := 0.150000
							if( mf > -0.629934 )
								if( ad_mf <= -170276 )
									ret := -0.266667
								if( ad_mf > -170276 )
									ret := 0.406504
					if( mf > -0.398799 )
						if( ad_mf <= -172349 )
							if( ad_mf <= -173927 )
								if( ad <= -176161 )
									ret := 0.042857
								if( ad > -176161 )
									ret := 0.561404
							if( ad_mf > -173927 )
								if( VIP <= 1.07185 )
									ret := -0.710526 // sell
								if( VIP > 1.07185 )
									ret := 0.444444
						if( ad_mf > -172349 )
							if( ad_mf <= -135832 )
								if( mf <= -0.262936 )
									ret := -0.005618
								if( mf > -0.262936 )
									ret := 0.286976
							if( ad_mf > -135832 )
								if( VIP_VIM <= 0.286117 )
									ret := 0.134181
								if( VIP_VIM > 0.286117 )
									ret := -0.117647
			if( ad_mf > -112316 )
				if( ad_mf <= -7460.03 )
					if( ad <= -111237 )
						if( VIM <= 1.11046 )
							if( ad_mf <= -111758 )
								if( VIP_VIM <= -0.030046 )
									ret := -0.888889 // sell
								if( VIP_VIM > -0.030046 )
									ret := -0.100000
							if( ad_mf > -111758 )
								if( VIP_VIM <= 0.480249 )
									ret := -1.000000 // sell
								if( VIP_VIM > 0.480249 )
									ret := -0.500000
						if( VIM > 1.11046 )
							if( VIP <= 0.838978 )
								if( ad_mf <= -111678 )
									ret := 1.000000 // buy
								if( ad_mf > -111678 )
									ret := 0.750000 // buy
							if( VIP > 0.838978 )
								if( ad <= -111775 )
									ret := -0.818182 // sell
								if( ad > -111775 )
									ret := 1.000000 // buy
					if( ad > -111237 )
						if( VIM <= 1.44799 )
							if( mf <= -0.244979 )
								if( VIP_VIM <= -0.260986 )
									ret := 0.017078
								if( VIP_VIM > -0.260986 )
									ret := -0.130779
							if( mf > -0.244979 )
								if( ad <= -77380.3 )
									ret := 0.084694
								if( ad > -77380.3 )
									ret := 0.028179
						if( VIM > 1.44799 )
							if( ad <= -76261.9 )
								if( ad_mf <= -95381.9 )
									ret := -0.304348
								if( ad_mf > -95381.9 )
									ret := -0.709677 // sell
							if( ad > -76261.9 )
								if( VIM <= 1.4548 )
									ret := -0.600000
								if( VIM > 1.4548 )
									ret := 0.034722
				if( ad_mf > -7460.03 )
					if( mf <= 0.032473 )
						if( VIP <= 0.934362 )
							if( ad <= -6994.58 )
								if( ad <= -7036.11 )
									ret := -0.645833
								if( ad > -7036.11 )
									ret := -1.000000 // sell
							if( ad > -6994.58 )
								if( ad_mf <= -6775.69 )
									ret := -0.142857
								if( ad_mf > -6775.69 )
									ret := -1.000000 // sell
						if( VIP > 0.934362 )
							if( ad_mf <= -6987.35 )
								if( ad <= -7072.73 )
									ret := -0.307692
								if( ad > -7072.73 )
									ret := 0.307692
							if( ad_mf > -6987.35 )
								if( VIP_VIM <= -0.010651 )
									ret := -0.555556
								if( VIP_VIM > -0.010651 )
									ret := -0.812500 // sell
					if( mf > 0.032473 )
						if( ad_mf <= -7336.51 )
							if( ad_mf <= -7378.98 )
								if( VIP_VIM <= 0.072083 )
									ret := 0.200000
								if( VIP_VIM > 0.072083 )
									ret := -0.625000
							if( ad_mf > -7378.98 )
								if( VIP <= 1.2493 )
									ret := -0.937500 // sell
								if( VIP > 1.2493 )
									ret := -0.500000
						if( ad_mf > -7336.51 )
							if( VIM <= 1.17523 )
								if( mf <= 0.254574 )
									ret := 0.012346
								if( mf > 0.254574 )
									ret := 0.533333
							if( VIM > 1.17523 )
								if( mf <= 0.336072 )
									ret := 0.500000
								if( mf > 0.336072 )
									ret := 1.000000 // buy
		if( ad > -6731.61 )
			if( VIP_VIM <= 0.086616 )
				if( ad_mf <= -197.172 )
					if( ad_mf <= -4623.72 )
						if( mf <= 0.372458 )
							if( mf <= 0.194662 )
								if( VIM <= 1.0351 )
									ret := 0.040541
								if( VIM > 1.0351 )
									ret := 0.406193
							if( mf > 0.194662 )
								if( VIP <= 1.38314 )
									ret := 0.157895
								if( VIP > 1.38314 )
									ret := -0.636364
						if( mf > 0.372458 )
							if( ad_mf <= -5198.12 )
								ret := 1.000000 // buy
							if( ad_mf > -5198.12 )
								ret := 0.600000
					if( ad_mf > -4623.72 )
						if( ad <= -294.089 )
							if( mf <= -0.06665 )
								if( ad <= -473.5 )
									ret := 0.244288
								if( ad > -473.5 )
									ret := 0.033088
							if( mf > -0.06665 )
								if( VIP <= 0.945372 )
									ret := 0.251082
								if( VIP > 0.945372 )
									ret := 0.093328
						if( ad > -294.089 )
							if( VIP_VIM <= -0.128887 )
								if( mf <= -0.494722 )
									ret := -0.666667
								if( mf > -0.494722 )
									ret := 0.687500
							if( VIP_VIM > -0.128887 )
								if( ad_mf <= -253.566 )
									ret := 0.606061
								if( ad_mf > -253.566 )
									ret := -0.031250
				if( ad_mf > -197.172 )
					if( VIP <= 0.911003 )
						if( VIM <= 1.14067 )
							if( VIP <= 0.883701 )
								ret := 0.200000
							if( VIP > 0.883701 )
								if( VIP <= 0.898484 )
									ret := -0.700000 // sell
								if( VIP > 0.898484 )
									ret := -0.153846
						if( VIM > 1.14067 )
							if( ad_mf <= 0.396965 )
								if( mf <= 0.044049 )
									ret := 0.342905
								if( mf > 0.044049 )
									ret := 0.086331
							if( ad_mf > 0.396965 )
								if( VIP <= 0.850524 )
									ret := -0.008621
								if( VIP > 0.850524 )
									ret := 0.245098
					if( VIP > 0.911003 )
						if( ad_mf <= -108.781 )
							if( VIP_VIM <= -0.1235 )
								if( ad_mf <= -144.336 )
									ret := -0.500000
								if( ad_mf > -144.336 )
									ret := -0.880000 // sell
							if( VIP_VIM > -0.1235 )
								if( mf <= -0.185959 )
									ret := 0.400000
								if( mf > -0.185959 )
									ret := -0.533333
						if( ad_mf > -108.781 )
							if( VIP <= 1.67755 )
								if( ad_mf <= 439.613 )
									ret := 0.098852
								if( ad_mf > 439.613 )
									ret := 0.267857
							if( VIP > 1.67755 )
								if( VIP <= 2.90169 )
									ret := -0.065748
								if( VIP > 2.90169 )
									ret := 0.198413
			if( VIP_VIM > 0.086616 )
				if( ad <= -454.667 )
					if( ad_mf <= -530.668 )
						if( ad <= -6670.44 )
							if( VIP_VIM <= 0.160475 )
								ret := 0.250000
							if( VIP_VIM > 0.160475 )
								if( VIP <= 1.24462 )
									ret := 0.750000 // buy
								if( VIP > 1.24462 )
									ret := 1.000000 // buy
						if( ad > -6670.44 )
							if( VIP <= 1.23237 )
								if( mf <= -0.296989 )
									ret := 0.558824
								if( mf > -0.296989 )
									ret := 0.146811
							if( VIP > 1.23237 )
								if( ad_mf <= -695.256 )
									ret := 0.079458
								if( ad_mf > -695.256 )
									ret := -0.107744
					if( ad_mf > -530.668 )
						if( VIP <= 1.4792 )
							if( ad <= -480.549 )
								if( ad_mf <= -485.228 )
									ret := 0.333333
								if( ad_mf > -485.228 )
									ret := 1.000000 // buy
							if( ad > -480.549 )
								if( mf <= 0.138676 )
									ret := -0.250000
								if( mf > 0.138676 )
									ret := 0.625000
						if( VIP > 1.4792 )
							if( ad_mf <= -466.693 )
								if( VIP_VIM <= 0.836409 )
									ret := 0.630137
								if( VIP_VIM > 0.836409 )
									ret := 0.266667
							if( ad_mf > -466.693 )
								ret := 1.000000 // buy
				if( ad > -454.667 )
					if( ad <= -448.129 )
						if( ad <= -451.467 )
							ret := -0.250000
						if( ad > -451.467 )
							if( VIP_VIM <= 0.335583 )
								ret := -1.000000 // sell
							if( VIP_VIM > 0.335583 )
								ret := -0.333333
					if( ad > -448.129 )
						if( VIP <= 2.793 )
							if( mf <= 0.431967 )
								if( VIP_VIM <= 1.12154 )
									ret := -0.041464
								if( VIP_VIM > 1.12154 )
									ret := -0.500000
							if( mf > 0.431967 )
								if( VIP_VIM <= 0.924662 )
									ret := 0.078224
								if( VIP_VIM > 0.924662 )
									ret := 0.448276
						if( VIP > 2.793 )
							if( mf <= -0.050956 )
								if( VIP_VIM <= 0.150376 )
									ret := 0.545455
								if( VIP_VIM > 0.150376 )
									ret := -0.086957
							if( mf > -0.050956 )
								if( mf <= 0.417616 )
									ret := 0.287823
								if( mf > 0.417616 )
									ret := -0.081081
	if( ad_mf > 589.922 )
		if( VIP_VIM <= 0.000702 )
			if( ad <= 80861 )
				if( mf <= 0.433786 )
					if( ad <= 13439.9 )
						if( ad_mf <= 2683.11 )
							if( ad_mf <= 833.698 )
								if( ad_mf <= 816.281 )
									ret := 0.089041
								if( ad_mf > 816.281 )
									ret := 0.750000 // buy
							if( ad_mf > 833.698 )
								if( mf <= 0.328372 )
									ret := -0.050672
								if( mf > 0.328372 )
									ret := 0.302632
						if( ad_mf > 2683.11 )
							if( VIP <= 1.42318 )
								if( VIM <= 1.20043 )
									ret := 0.115957
								if( VIM > 1.20043 )
									ret := 0.231589
							if( VIP > 1.42318 )
								if( ad <= 3057.77 )
									ret := 0.411765
								if( ad > 3057.77 )
									ret := -0.333333
					if( ad > 13439.9 )
						if( ad <= 13582.8 )
							if( ad_mf <= 13513.6 )
								if( VIM <= 1.17311 )
									ret := 0.000000
								if( VIM > 1.17311 )
									ret := -0.500000
							if( ad_mf > 13513.6 )
								if( ad_mf <= 13546.3 )
									ret := -0.750000 // sell
								if( ad_mf > 13546.3 )
									ret := -1.000000 // sell
						if( ad > 13582.8 )
							if( mf <= -0.225631 )
								if( VIP <= 0.900772 )
									ret := -0.001695
								if( VIP > 0.900772 )
									ret := -0.222672
							if( mf > -0.225631 )
								if( ad <= 28672 )
									ret := -0.036326
								if( ad > 28672 )
									ret := 0.058663
				if( mf > 0.433786 )
					if( VIP_VIM <= -0.036173 )
						if( ad <= 2204.99 )
							if( ad <= 794.324 )
								if( VIP_VIM <= -0.256457 )
									ret := 0.090909
								if( VIP_VIM > -0.256457 )
									ret := -0.600000
							if( ad > 794.324 )
								if( VIM <= 1.19995 )
									ret := 1.000000 // buy
								if( VIM > 1.19995 )
									ret := 0.271429
						if( ad > 2204.99 )
							if( VIP_VIM <= -0.75867 )
								if( VIM <= 1.88996 )
									ret := 1.000000 // buy
								if( VIM > 1.88996 )
									ret := -0.500000
							if( VIP_VIM > -0.75867 )
								if( VIM <= 1.70102 )
									ret := -0.455882
								if( VIM > 1.70102 )
									ret := -0.789474 // sell
					if( VIP_VIM > -0.036173 )
						if( VIM <= 1.31331 )
							if( mf <= 0.470459 )
								ret := -0.750000 // sell
							if( mf > 0.470459 )
								if( mf <= 0.602986 )
									ret := 0.142857
								if( mf > 0.602986 )
									ret := -0.600000
						if( VIM > 1.31331 )
							if( VIP <= 1.52465 )
								if( mf <= 0.5828 )
									ret := -1.000000 // sell
								if( mf > 0.5828 )
									ret := -0.750000 // sell
							if( VIP > 1.52465 )
								ret := -0.500000
			if( ad > 80861 )
				if( VIM <= 1.07163 )
					if( mf <= 0.024145 )
						if( VIP_VIM <= -0.002982 )
							if( mf <= 0.021856 )
								if( ad <= 330305 )
									ret := -0.154122
								if( ad > 330305 )
									ret := 0.190476
							if( mf > 0.021856 )
								if( mf <= 0.023615 )
									ret := -0.750000 // sell
								if( mf > 0.023615 )
									ret := -1.000000 // sell
						if( VIP_VIM > -0.002982 )
							ret := 0.750000 // buy
					if( mf > 0.024145 )
						if( VIP_VIM <= -0.059247 )
							if( ad_mf <= 256531 )
								if( VIP <= 0.812282 )
									ret := -0.800000 // sell
								if( VIP > 0.812282 )
									ret := 0.125683
							if( ad_mf > 256531 )
								if( VIP <= 0.797893 )
									ret := 0.583333
								if( VIP > 0.797893 )
									ret := -0.244444
						if( VIP_VIM > -0.059247 )
							if( mf <= 0.086132 )
								if( VIM <= 1.04247 )
									ret := 0.530612
								if( VIM > 1.04247 )
									ret := -0.142857
							if( mf > 0.086132 )
								if( VIP_VIM <= -0.008287 )
									ret := 0.106509
								if( VIP_VIM > -0.008287 )
									ret := 0.421053
				if( VIM > 1.07163 )
					if( ad <= 83351.3 )
						if( VIP <= 0.949946 )
							if( VIP_VIM <= -0.354209 )
								if( ad <= 81922.9 )
									ret := 0.818182 // buy
								if( ad > 81922.9 )
									ret := 0.300000
							if( VIP_VIM > -0.354209 )
								if( ad <= 82631 )
									ret := 0.040000
								if( ad > 82631 )
									ret := 0.800000 // buy
						if( VIP > 0.949946 )
							if( VIP <= 1.08363 )
								if( VIM <= 1.07978 )
									ret := 0.500000
								if( VIM > 1.07978 )
									ret := 0.966667 // buy
							if( VIP > 1.08363 )
								ret := 0.500000
					if( ad > 83351.3 )
						if( ad_mf <= 635527 )
							if( ad_mf <= 476069 )
								if( VIM <= 1.32652 )
									ret := 0.163551
								if( VIM > 1.32652 )
									ret := -0.008282
							if( ad_mf > 476069 )
								if( VIP <= 0.896273 )
									ret := -0.593220
								if( VIP > 0.896273 )
									ret := 0.137931
						if( ad_mf > 635527 )
							if( ad_mf <= 1.26998e+06 )
								if( VIM <= 1.18152 )
									ret := 0.352941
								if( VIM > 1.18152 )
									ret := 0.869565 // buy
							if( ad_mf > 1.26998e+06 )
								ret := -0.200000
		if( VIP_VIM > 0.000702 )
			if( ad <= 1784.81 )
				if( ad_mf <= 1761.23 )
					if( VIM <= 1.73783 )
						if( ad <= 620.868 )
							if( VIM <= 0.873574 )
								if( mf <= 0.259911 )
									ret := 0.000000
								if( mf > 0.259911 )
									ret := 0.400000
							if( VIM > 0.873574 )
								if( ad_mf <= 605.135 )
									ret := -0.186047
								if( ad_mf > 605.135 )
									ret := -0.666667
						if( ad > 620.868 )
							if( VIM <= 1.22477 )
								if( VIP_VIM <= 0.950285 )
									ret := -0.050435
								if( VIP_VIM > 0.950285 )
									ret := 0.451613
							if( VIM > 1.22477 )
								if( VIM <= 1.2298 )
									ret := -0.916667 // sell
								if( VIM > 1.2298 )
									ret := -0.238532
					if( VIM > 1.73783 )
						if( VIM <= 2.4423 )
							if( ad <= 817.641 )
								if( VIM <= 1.75205 )
									ret := 1.000000 // buy
								if( VIM > 1.75205 )
									ret := -0.326087
							if( ad > 817.641 )
								if( mf <= -0.111531 )
									ret := 0.600000
								if( mf > -0.111531 )
									ret := 0.139860
						if( VIM > 2.4423 )
							if( VIM <= 2.48206 )
								ret := -0.833333 // sell
							if( VIM > 2.48206 )
								if( VIP_VIM <= 1.18011 )
									ret := -0.101266
								if( VIP_VIM > 1.18011 )
									ret := -1.000000 // sell
				if( ad_mf > 1761.23 )
					if( ad <= 1764.5 )
						ret := -1.000000 // sell
					if( ad > 1764.5 )
						if( mf <= 0.256348 )
							if( VIP_VIM <= 0.361529 )
								ret := 0.166667
							if( VIP_VIM > 0.361529 )
								ret := -0.500000
						if( mf > 0.256348 )
							if( VIP_VIM <= 0.120478 )
								ret := -1.000000 // sell
							if( VIP_VIM > 0.120478 )
								ret := -0.200000
			if( ad > 1784.81 )
				if( ad <= 302134 )
					if( ad_mf <= 232995 )
						if( ad <= 209890 )
							if( ad_mf <= 114525 )
								if( VIM <= 0.838023 )
									ret := 0.046733
								if( VIM > 0.838023 )
									ret := -0.032409
							if( ad_mf > 114525 )
								if( ad_mf <= 117906 )
									ret := 0.422018
								if( ad_mf > 117906 )
									ret := 0.055365
						if( ad > 209890 )
							if( VIP <= 1.2641 )
								if( ad_mf <= 228638 )
									ret := 0.072165
								if( ad_mf > 228638 )
									ret := -0.714286 // sell
							if( VIP > 1.2641 )
								if( VIM <= 0.906708 )
									ret := -0.440000
								if( VIM > 0.906708 )
									ret := -0.911765 // sell
					if( ad_mf > 232995 )
						if( ad_mf <= 251758 )
							if( mf <= 0.211935 )
								if( ad_mf <= 234176 )
									ret := 0.571429
								if( ad_mf > 234176 )
									ret := -0.027778
							if( mf > 0.211935 )
								if( ad <= 242789 )
									ret := 0.476190
								if( ad > 242789 )
									ret := 0.972973 // buy
						if( ad_mf > 251758 )
							if( ad_mf <= 253078 )
								if( ad_mf <= 252153 )
									ret := 0.000000
								if( ad_mf > 252153 )
									ret := -0.833333 // sell
							if( ad_mf > 253078 )
								if( mf <= 0.771172 )
									ret := 0.168000
								if( mf > 0.771172 )
									ret := 0.900000 // buy
				if( ad > 302134 )
					if( ad_mf <= 449287 )
						if( VIP_VIM <= 0.266863 )
							if( ad_mf <= 308958 )
								if( VIM <= 0.955813 )
									ret := -1.000000 // sell
								if( VIM > 0.955813 )
									ret := -0.200000
							if( ad_mf > 308958 )
								if( VIP <= 0.937785 )
									ret := 1.000000 // buy
								if( VIP > 0.937785 )
									ret := -0.125000
						if( VIP_VIM > 0.266863 )
							if( ad <= 351093 )
								if( VIP <= 1.32764 )
									ret := -0.777778 // sell
								if( VIP > 1.32764 )
									ret := -0.392857
							if( ad > 351093 )
								if( ad <= 375094 )
									ret := 0.161290
								if( ad > 375094 )
									ret := -0.542636
					if( ad_mf > 449287 )
						if( VIP_VIM <= 0.293878 )
							if( mf <= 0.679292 )
								if( ad <= 1.06776e+06 )
									ret := 0.050420
								if( ad > 1.06776e+06 )
									ret := 0.565217
							if( mf > 0.679292 )
								if( ad_mf <= 480709 )
									ret := -0.250000
								if( ad_mf > 480709 )
									ret := 0.918367 // buy
						if( VIP_VIM > 0.293878 )
							if( VIM <= 0.547546 )
								if( VIP_VIM <= 0.769572 )
									ret := -0.176471
								if( VIP_VIM > 0.769572 )
									ret := -0.833333 // sell
							if( VIM > 0.547546 )
								if( ad_mf <= 574765 )
									ret := 0.380282
								if( ad_mf > 574765 )
									ret := -0.341667
	
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
float op_operation = decision_tree_0_CRWD_15Min_6d135d4f(mf, ad_mf, ad, VIP, VIP_VIM, VIM)

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


