//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Vortex_Indicator
// ID_model: APPS_15Min_2CV0_b29b2796 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_APPS_15Min_2CV0_b29b2796", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_APPS_15Min_b29b2796(ad, mf, ad_mf, VIP, VIM, VIP_VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ad_mf <= 0.74759 )
		if( VIP <= 1.05576 )
			if( ad_mf <= -100588 )
				if( VIM <= 1.3167 )
					if( mf <= -0.482805 )
						if( VIP <= 0.725019 )
							if( VIP_VIM <= -0.693046 )
								ret := -0.333333
							if( VIP_VIM > -0.693046 )
								if( mf <= -0.843444 )
									ret := -0.250000
								if( mf > -0.843444 )
									ret := 0.666667
						if( VIP > 0.725019 )
							if( VIP <= 0.924478 )
								if( VIM <= 1.29611 )
									ret := -0.292035
								if( VIM > 1.29611 )
									ret := 1.000000 // buy
							if( VIP > 0.924478 )
								if( mf <= -0.667372 )
									ret := -0.100000
								if( mf > -0.667372 )
									ret := 0.450000
					if( mf > -0.482805 )
						if( ad <= -503294 )
							if( VIP_VIM <= -0.337805 )
								if( mf <= -0.334832 )
									ret := -1.000000 // sell
								if( mf > -0.334832 )
									ret := -0.166667
							if( VIP_VIM > -0.337805 )
								if( VIM <= 0.875104 )
									ret := -1.000000 // sell
								if( VIM > 0.875104 )
									ret := 0.357143
						if( ad > -503294 )
							if( VIP <= 0.792745 )
								if( ad_mf <= -242550 )
									ret := 0.769231 // buy
								if( ad_mf > -242550 )
									ret := 0.448529
							if( VIP > 0.792745 )
								if( VIM <= 1.1561 )
									ret := 0.358289
								if( VIM > 1.1561 )
									ret := 0.186441
				if( VIM > 1.3167 )
					if( ad <= -107612 )
						if( ad_mf <= -197605 )
							if( ad_mf <= -239956 )
								if( ad_mf <= -256863 )
									ret := 0.278689
								if( ad_mf > -256863 )
									ret := -0.700000 // sell
							if( ad_mf > -239956 )
								if( mf <= -0.542534 )
									ret := 0.000000
								if( mf > -0.542534 )
									ret := 0.705882 // buy
						if( ad_mf > -197605 )
							if( ad <= -187555 )
								if( VIM <= 1.39116 )
									ret := -1.000000 // sell
								if( VIM > 1.39116 )
									ret := -0.666667
							if( ad > -187555 )
								if( ad <= -111707 )
									ret := -0.024845
								if( ad > -111707 )
									ret := 0.608696
					if( ad > -107612 )
						if( ad <= -104205 )
							if( VIM <= 1.55297 )
								ret := -1.000000 // sell
							if( VIM > 1.55297 )
								ret := -0.500000
						if( ad > -104205 )
							ret := 0.000000
			if( ad_mf > -100588 )
				if( ad_mf <= -16860.9 )
					if( VIP <= 0.887212 )
						if( VIM <= 1.10147 )
							if( ad <= -27411.3 )
								if( ad_mf <= -94987 )
									ret := -0.111111
								if( ad_mf > -94987 )
									ret := 0.602410
							if( ad > -27411.3 )
								if( VIP <= 0.846914 )
									ret := 0.733333 // buy
								if( VIP > 0.846914 )
									ret := -0.034483
						if( VIM > 1.10147 )
							if( VIM <= 1.28274 )
								if( mf <= -0.237469 )
									ret := 0.275049
								if( mf > -0.237469 )
									ret := 0.108475
							if( VIM > 1.28274 )
								if( ad <= -30352.4 )
									ret := -0.086384
								if( ad > -30352.4 )
									ret := 0.226667
					if( VIP > 0.887212 )
						if( ad_mf <= -98440.2 )
							if( ad <= -99912.3 )
								if( VIP <= 0.989929 )
									ret := 0.000000
								if( VIP > 0.989929 )
									ret := 0.250000
							if( ad > -99912.3 )
								if( VIP <= 0.943561 )
									ret := 0.333333
								if( VIP > 0.943561 )
									ret := 0.857143 // buy
						if( ad_mf > -98440.2 )
							if( VIM <= 1.27561 )
								if( ad_mf <= -17060.8 )
									ret := 0.046997
								if( ad_mf > -17060.8 )
									ret := -0.407407
							if( VIM > 1.27561 )
								if( mf <= -0.492135 )
									ret := -0.535714
								if( mf > -0.492135 )
									ret := -0.050125
				if( ad_mf > -16860.9 )
					if( mf <= -0.166865 )
						if( ad_mf <= 0.584534 )
							if( VIP_VIM <= -1.22019 )
								if( VIP <= 0.753353 )
									ret := -0.700000 // sell
								if( VIP > 0.753353 )
									ret := 0.125000
							if( VIP_VIM > -1.22019 )
								if( ad_mf <= -199.729 )
									ret := 0.274062
								if( ad_mf > -199.729 )
									ret := 0.191799
						if( ad_mf > 0.584534 )
							if( VIP <= 0.770514 )
								if( VIP <= 0.679364 )
									ret := 0.333333
								if( VIP > 0.679364 )
									ret := 0.909091 // buy
							if( VIP > 0.770514 )
								if( VIP_VIM <= -0.419603 )
									ret := -0.589744
								if( VIP_VIM > -0.419603 )
									ret := -0.028571
					if( mf > -0.166865 )
						if( ad_mf <= -16740.5 )
							if( mf <= -0.075408 )
								ret := 0.500000
							if( mf > -0.075408 )
								if( VIP <= 0.947803 )
									ret := 0.750000 // buy
								if( VIP > 0.947803 )
									ret := 1.000000 // buy
						if( ad_mf > -16740.5 )
							if( ad_mf <= 0.061006 )
								if( ad_mf <= -3928.63 )
									ret := 0.098239
								if( ad_mf > -3928.63 )
									ret := 0.175037
							if( ad_mf > 0.061006 )
								if( VIP_VIM <= -0.260418 )
									ret := 0.182796
								if( VIP_VIM > -0.260418 )
									ret := -0.131579
		if( VIP > 1.05576 )
			if( ad_mf <= -0.712043 )
				if( ad <= -12015.8 )
					if( ad <= -164730 )
						if( mf <= -0.211209 )
							if( ad_mf <= -172264 )
								if( ad_mf <= -182585 )
									ret := -0.172414
								if( ad_mf > -182585 )
									ret := 0.777778 // buy
							if( ad_mf > -172264 )
								if( VIM <= 1.40622 )
									ret := -0.250000
								if( VIM > 1.40622 )
									ret := -0.857143 // sell
						if( mf > -0.211209 )
							if( VIM <= 0.640522 )
								if( mf <= 0.17882 )
									ret := 0.190476
								if( mf > 0.17882 )
									ret := -0.421053
							if( VIM > 0.640522 )
								if( VIP <= 1.07299 )
									ret := -0.115385
								if( VIP > 1.07299 )
									ret := 0.481572
					if( ad > -164730 )
						if( VIM <= 1.27283 )
							if( ad_mf <= -143435 )
								if( mf <= 0.031917 )
									ret := -0.444444
								if( mf > 0.031917 )
									ret := 0.049383
							if( ad_mf > -143435 )
								if( ad <= -110312 )
									ret := 0.272487
								if( ad > -110312 )
									ret := 0.033893
						if( VIM > 1.27283 )
							if( ad_mf <= -38329.3 )
								if( ad_mf <= -135271 )
									ret := 0.310345
								if( ad_mf > -135271 )
									ret := -0.217096
							if( ad_mf > -38329.3 )
								if( ad_mf <= -33743.1 )
									ret := 0.392308
								if( ad_mf > -33743.1 )
									ret := -0.050179
				if( ad > -12015.8 )
					if( VIP_VIM <= 0.295012 )
						if( ad_mf <= -286.769 )
							if( ad_mf <= -300.126 )
								if( VIM <= 1.09428 )
									ret := 0.104728
								if( VIM > 1.09428 )
									ret := 0.170817
							if( ad_mf > -300.126 )
								if( VIP <= 1.0895 )
									ret := 0.428571
								if( VIP > 1.0895 )
									ret := -0.396226
						if( ad_mf > -286.769 )
							if( VIM <= 3.43465 )
								if( VIP <= 1.09123 )
									ret := -0.019608
								if( VIP > 1.09123 )
									ret := 0.372727
							if( VIM > 3.43465 )
								if( mf <= 0.786187 )
									ret := -0.857143 // sell
								if( mf > 0.786187 )
									ret := 0.000000
					if( VIP_VIM > 0.295012 )
						if( ad_mf <= -400 )
							if( ad_mf <= -11000.4 )
								if( VIM <= 0.870071 )
									ret := 0.135802
								if( VIM > 0.870071 )
									ret := 0.666667
							if( ad_mf > -11000.4 )
								if( ad <= -9314.57 )
									ret := -0.133333
								if( ad > -9314.57 )
									ret := 0.054530
						if( ad_mf > -400 )
							if( VIM <= 1.21142 )
								if( VIM <= 0.907199 )
									ret := 0.222222
								if( VIM > 0.907199 )
									ret := 0.615385
							if( VIM > 1.21142 )
								if( ad_mf <= -324.058 )
									ret := 0.547619
								if( ad_mf > -324.058 )
									ret := -0.139785
			if( ad_mf > -0.712043 )
				if( VIP_VIM <= -0.424795 )
					if( VIP_VIM <= -0.735487 )
						if( VIM <= 5.14878 )
							if( mf <= -0.227629 )
								if( VIM <= 4.41358 )
									ret := 0.568421
								if( VIM > 4.41358 )
									ret := -0.750000 // sell
							if( mf > -0.227629 )
								if( VIP <= 1.22788 )
									ret := -0.444444
								if( VIP > 1.22788 )
									ret := 0.210191
						if( VIM > 5.14878 )
							if( ad_mf <= 0.288357 )
								if( VIP_VIM <= -2.26763 )
									ret := 0.000000
								if( VIP_VIM > -2.26763 )
									ret := -0.692308
							if( ad_mf > 0.288357 )
								ret := 0.000000
					if( VIP_VIM > -0.735487 )
						if( ad_mf <= -0.1322 )
							if( VIM <= 4.18552 )
								if( mf <= 0.266564 )
									ret := 0.485714
								if( mf > 0.266564 )
									ret := -0.163265
							if( VIM > 4.18552 )
								if( VIP <= 5.14346 )
									ret := -1.000000 // sell
								if( VIP > 5.14346 )
									ret := 0.000000
						if( ad_mf > -0.1322 )
							if( mf <= -0.239275 )
								if( VIP_VIM <= -0.695099 )
									ret := 0.111111
								if( VIP_VIM > -0.695099 )
									ret := -0.569832
							if( mf > -0.239275 )
								if( VIP <= 1.70769 )
									ret := -0.367647
								if( VIP > 1.70769 )
									ret := -0.052288
				if( VIP_VIM > -0.424795 )
					if( mf <= 0.536642 )
						if( VIM <= 7.78409 )
							if( VIP <= 1.83377 )
								if( VIM <= 2.04996 )
									ret := 0.058797
								if( VIM > 2.04996 )
									ret := 0.623377
							if( VIP > 1.83377 )
								if( VIM <= 0.785501 )
									ret := 1.000000 // buy
								if( VIM > 0.785501 )
									ret := -0.052124
						if( VIM > 7.78409 )
							if( mf <= -0.274943 )
								ret := 0.000000
							if( mf > -0.274943 )
								if( VIM <= 9.74946 )
									ret := 1.000000 // buy
								if( VIM > 9.74946 )
									ret := 0.833333 // buy
					if( mf > 0.536642 )
						if( VIM <= 1.36847 )
							if( ad_mf <= -0.537508 )
								if( VIM <= 1.1555 )
									ret := -0.309353
								if( VIM > 1.1555 )
									ret := -0.550000
							if( ad_mf > -0.537508 )
								ret := -1.000000 // sell
						if( VIM > 1.36847 )
							if( VIP_VIM <= 0.100139 )
								if( VIP_VIM <= -0.156655 )
									ret := -0.142857
								if( VIP_VIM > -0.156655 )
									ret := 0.638298
							if( VIP_VIM > 0.100139 )
								if( ad_mf <= -0.550928 )
									ret := -0.328125
								if( ad_mf > -0.550928 )
									ret := 0.625000
	if( ad_mf > 0.74759 )
		if( ad <= 18545.3 )
			if( ad_mf <= 539.971 )
				if( ad_mf <= 538.334 )
					if( ad <= 179.063 )
						if( VIM <= 0.951753 )
							if( VIP <= 1.07709 )
								if( ad <= 128.004 )
									ret := -0.333333
								if( ad > 128.004 )
									ret := -1.000000 // sell
							if( VIP > 1.07709 )
								if( ad_mf <= 136.041 )
									ret := 0.320000
								if( ad_mf > 136.041 )
									ret := 0.833333 // buy
						if( VIM > 0.951753 )
							if( ad_mf <= 157.977 )
								if( ad <= 141.999 )
									ret := -0.048872
								if( ad > 141.999 )
									ret := -0.666667
							if( ad_mf > 157.977 )
								if( ad_mf <= 166.495 )
									ret := 0.888889 // buy
								if( ad_mf > 166.495 )
									ret := 0.000000
					if( ad > 179.063 )
						if( ad <= 214.879 )
							if( VIP_VIM <= -0.421653 )
								if( ad <= 194.7 )
									ret := -0.750000 // sell
								if( ad > 194.7 )
									ret := 0.095238
							if( VIP_VIM > -0.421653 )
								if( mf <= 0.283908 )
									ret := -0.474860
								if( mf > 0.283908 )
									ret := -0.806452 // sell
						if( ad > 214.879 )
							if( VIP_VIM <= 0.207996 )
								if( ad_mf <= 499.442 )
									ret := -0.067236
								if( ad_mf > 499.442 )
									ret := -0.247899
							if( VIP_VIM > 0.207996 )
								if( ad_mf <= 235.97 )
									ret := 0.560000
								if( ad_mf > 235.97 )
									ret := -0.282258
				if( ad_mf > 538.334 )
					ret := -1.000000 // sell
			if( ad_mf > 539.971 )
				if( VIP_VIM <= -0.394062 )
					if( ad <= 17991.8 )
						if( ad <= 9757.84 )
							if( ad_mf <= 1880.54 )
								if( VIP <= 1.99483 )
									ret := 0.173387
								if( VIP > 1.99483 )
									ret := -0.407895
							if( ad_mf > 1880.54 )
								if( VIP_VIM <= -0.452606 )
									ret := -0.141720
								if( VIP_VIM > -0.452606 )
									ret := 0.080169
						if( ad > 9757.84 )
							if( ad <= 9921.62 )
								if( VIP_VIM <= -0.52338 )
									ret := 1.000000 // buy
								if( VIP_VIM > -0.52338 )
									ret := 0.400000
							if( ad > 9921.62 )
								if( VIM <= 1.59473 )
									ret := 0.219178
								if( VIM > 1.59473 )
									ret := -0.068493
					if( ad > 17991.8 )
						if( ad <= 18206.9 )
							if( ad_mf <= 18143.9 )
								ret := -0.333333
							if( ad_mf > 18143.9 )
								if( ad_mf <= 18159.2 )
									ret := -0.750000 // sell
								if( ad_mf > 18159.2 )
									ret := -1.000000 // sell
						if( ad > 18206.9 )
							if( ad <= 18517.5 )
								ret := 0.000000
							if( ad > 18517.5 )
								ret := -0.800000 // sell
				if( VIP_VIM > -0.394062 )
					if( ad <= 548.752 )
						if( VIP <= 1.1385 )
							ret := 0.000000
						if( VIP > 1.1385 )
							if( VIP <= 1.54658 )
								if( ad_mf <= 548.019 )
									ret := 1.000000 // buy
								if( ad_mf > 548.019 )
									ret := 0.750000 // buy
							if( VIP > 1.54658 )
								ret := 0.250000
					if( ad > 548.752 )
						if( mf <= -0.386889 )
							if( ad <= 9978.77 )
								if( VIM <= 0.836794 )
									ret := -0.888889 // sell
								if( VIM > 0.836794 )
									ret := 0.097248
							if( ad > 9978.77 )
								if( VIM <= 1.02943 )
									ret := 0.294118
								if( VIM > 1.02943 )
									ret := -0.434783
						if( mf > -0.386889 )
							if( ad <= 2818.87 )
								if( ad_mf <= 1202.19 )
									ret := -0.048835
								if( ad_mf > 1202.19 )
									ret := -0.175626
							if( ad > 2818.87 )
								if( ad_mf <= 2851.67 )
									ret := 0.600000
								if( ad_mf > 2851.67 )
									ret := -0.066301
		if( ad > 18545.3 )
			if( mf <= 0.573527 )
				if( ad <= 294432 )
					if( ad <= 230367 )
						if( VIP <= 1.43524 )
							if( VIM <= 1.49337 )
								if( ad <= 18855.4 )
									ret := 0.504673
								if( ad > 18855.4 )
									ret := 0.023294
							if( VIM > 1.49337 )
								if( ad_mf <= 19937.6 )
									ret := -0.607143
								if( ad_mf > 19937.6 )
									ret := -0.091295
						if( VIP > 1.43524 )
							if( VIP_VIM <= -0.239717 )
								if( VIM <= 2.04019 )
									ret := 0.142857
								if( VIM > 2.04019 )
									ret := -0.469388
							if( VIP_VIM > -0.239717 )
								if( ad_mf <= 19079.5 )
									ret := -0.555556
								if( ad_mf > 19079.5 )
									ret := 0.195495
					if( ad > 230367 )
						if( ad_mf <= 234870 )
							if( VIP_VIM <= -0.333167 )
								if( mf <= 0.01869 )
									ret := 0.400000
								if( mf > 0.01869 )
									ret := -1.000000 // sell
							if( VIP_VIM > -0.333167 )
								if( VIP_VIM <= 0.179267 )
									ret := -0.666667
								if( VIP_VIM > 0.179267 )
									ret := -0.913043 // sell
						if( ad_mf > 234870 )
							if( ad <= 237244 )
								if( ad <= 236536 )
									ret := 0.250000
								if( ad > 236536 )
									ret := 0.923077 // buy
							if( ad > 237244 )
								if( mf <= -0.066282 )
									ret := 0.423077
								if( mf > -0.066282 )
									ret := -0.314286
				if( ad > 294432 )
					if( ad <= 647690 )
						if( VIP <= 1.39807 )
							if( mf <= 0.507844 )
								if( mf <= 0.367228 )
									ret := 0.287066
								if( mf > 0.367228 )
									ret := 0.677778
							if( mf > 0.507844 )
								if( ad <= 614832 )
									ret := -0.354839
								if( ad > 614832 )
									ret := 1.000000 // buy
						if( VIP > 1.39807 )
							if( ad_mf <= 347146 )
								if( mf <= 0.402723 )
									ret := 0.636364
								if( mf > 0.402723 )
									ret := -0.500000
							if( ad_mf > 347146 )
								if( mf <= 0.494394 )
									ret := -0.750000 // sell
								if( mf > 0.494394 )
									ret := 0.000000
					if( ad > 647690 )
						if( VIP_VIM <= 0.203216 )
							if( VIP_VIM <= -0.534738 )
								if( VIM <= 1.31762 )
									ret := -1.000000 // sell
								if( VIM > 1.31762 )
									ret := -0.750000 // sell
							if( VIP_VIM > -0.534738 )
								if( VIM <= 0.944127 )
									ret := -1.000000 // sell
								if( VIM > 0.944127 )
									ret := -0.238095
						if( VIP_VIM > 0.203216 )
							if( VIP <= 1.14482 )
								if( VIP_VIM <= 0.28427 )
									ret := 0.750000 // buy
								if( VIP_VIM > 0.28427 )
									ret := 1.000000 // buy
							if( VIP > 1.14482 )
								if( VIP <= 1.25009 )
									ret := -0.555556
								if( VIP > 1.25009 )
									ret := 0.333333
			if( mf > 0.573527 )
				if( VIM <= 0.657508 )
					if( ad <= 219293 )
						if( VIP_VIM <= 0.729541 )
							if( VIP <= 1.23603 )
								ret := -1.000000 // sell
							if( VIP > 1.23603 )
								ret := -0.200000
						if( VIP_VIM > 0.729541 )
							if( ad_mf <= 54684.1 )
								ret := -0.600000
							if( ad_mf > 54684.1 )
								ret := -1.000000 // sell
					if( ad > 219293 )
						if( ad <= 431391 )
							if( ad_mf <= 378939 )
								if( mf <= 0.760476 )
									ret := -1.000000 // sell
								if( mf > 0.760476 )
									ret := 0.250000
							if( ad_mf > 378939 )
								ret := 1.000000 // buy
						if( ad > 431391 )
							if( VIP <= 1.3557 )
								if( mf <= 0.673639 )
									ret := -0.500000
								if( mf > 0.673639 )
									ret := -1.000000 // sell
							if( VIP > 1.3557 )
								ret := -0.250000
				if( VIM > 0.657508 )
					if( ad <= 789797 )
						if( VIP <= 1.22296 )
							if( VIP_VIM <= -0.175189 )
								if( mf <= 0.666903 )
									ret := -0.714286 // sell
								if( mf > 0.666903 )
									ret := 0.000000
							if( VIP_VIM > -0.175189 )
								if( ad <= 105526 )
									ret := 0.226415
								if( ad > 105526 )
									ret := -0.155039
						if( VIP > 1.22296 )
							if( VIP <= 1.49612 )
								if( ad_mf <= 47818 )
									ret := 0.153846
								if( ad_mf > 47818 )
									ret := -0.486842
							if( VIP > 1.49612 )
								if( ad <= 61874.3 )
									ret := -0.600000
								if( ad > 61874.3 )
									ret := 0.195652
					if( ad > 789797 )
						if( ad_mf <= 1.56905e+06 )
							if( VIP <= 1.15203 )
								ret := 1.000000 // buy
							if( VIP > 1.15203 )
								ret := 0.600000
						if( ad_mf > 1.56905e+06 )
							ret := -0.714286 // sell
	
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
float op_operation = decision_tree_0_APPS_15Min_b29b2796(ad, mf, ad_mf, VIP, VIM, VIP_VIM)

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


