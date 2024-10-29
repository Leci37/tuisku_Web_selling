//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Vortex_Indicator
// ID_model: MSFT_5Min_2BV0_f8cb5e4d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MSFT_5Min_2BV0_f8cb5e4d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MSFT_5Min_f8cb5e4d(bearPower, bbm, bbp, bullPower, BBPower_Color, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bbp <= -0.334228 )
		if( bbm <= 1.97637 )
			if( bbm <= 0.557293 )
				if( VIP_VIM <= -0.634198 )
					if( bbp <= -1.70058 )
						if( bbp <= -2.88123 )
							if( bbp <= -3.05821 )
								if( VIP <= 0.610106 )
									ret := -0.320000
								if( VIP > 0.610106 )
									ret := 0.640449
							if( bbp > -3.05821 )
								if( VIP_VIM <= -0.716172 )
									ret := -0.200000
								if( VIP_VIM > -0.716172 )
									ret := -0.900000 // sell
						if( bbp > -2.88123 )
							if( VIP <= 2.48422 )
								if( VIM <= 1.33458 )
									ret := 0.111111
								if( VIM > 1.33458 )
									ret := 0.608374
							if( VIP > 2.48422 )
								if( bbm <= 0.265439 )
									ret := 0.285714
								if( bbm > 0.265439 )
									ret := -0.666667
					if( bbp > -1.70058 )
						if( bullPower <= -0.657237 )
							if( VIP_VIM <= -1.10282 )
								if( bullPower <= -0.7159 )
									ret := 0.666667
								if( bullPower > -0.7159 )
									ret := 0.000000
							if( VIP_VIM > -1.10282 )
								if( VIM <= 2.71666 )
									ret := -0.462264
								if( VIM > 2.71666 )
									ret := 0.281250
						if( bullPower > -0.657237 )
							if( bbm <= 0.068947 )
								if( VIP_VIM <= -0.869152 )
									ret := 0.198864
								if( VIP_VIM > -0.869152 )
									ret := 0.398792
							if( bbm > 0.068947 )
								if( bearPower <= -0.627942 )
									ret := 0.249344
								if( bearPower > -0.627942 )
									ret := -0.023392
				if( VIP_VIM > -0.634198 )
					if( bbm <= 0.51054 )
						if( VIM <= 1.30682 )
							if( bearPower <= -1.09143 )
								if( bbp <= -2.58756 )
									ret := 0.290323
								if( bbp > -2.58756 )
									ret := -0.269103
							if( bearPower > -1.09143 )
								if( bbp <= -1.68496 )
									ret := 0.493333
								if( bbp > -1.68496 )
									ret := 0.065513
						if( VIM > 1.30682 )
							if( VIP_VIM <= 0.225033 )
								if( VIM <= 1.99418 )
									ret := 0.159116
								if( VIM > 1.99418 )
									ret := 0.025465
							if( VIP_VIM > 0.225033 )
								if( bbp <= -0.405541 )
									ret := 0.405063
								if( bbp > -0.405541 )
									ret := 0.021277
					if( bbm > 0.51054 )
						if( VIP <= 0.71221 )
							if( bbp <= -0.808576 )
								if( bullPower <= -0.983603 )
									ret := 1.000000 // buy
								if( bullPower > -0.983603 )
									ret := 0.689655
							if( bbp > -0.808576 )
								ret := -0.400000
						if( VIP > 0.71221 )
							if( bullPower <= -1.00117 )
								if( bullPower <= -1.36763 )
									ret := 0.642857
								if( bullPower > -1.36763 )
									ret := -0.750000 // sell
							if( bullPower > -1.00117 )
								if( VIP_VIM <= 0.057045 )
									ret := 0.188925
								if( VIP_VIM > 0.057045 )
									ret := 0.537500
			if( bbm > 0.557293 )
				if( VIP <= 0.640564 )
					if( bbp <= -7.93975 )
						if( VIM <= 1.4986 )
							ret := 1.000000 // buy
						if( VIM > 1.4986 )
							ret := 0.750000 // buy
					if( bbp > -7.93975 )
						if( bearPower <= -2.37213 )
							if( bearPower <= -2.62604 )
								if( bearPower <= -2.88639 )
									ret := -0.090278
								if( bearPower > -2.88639 )
									ret := -0.655738
							if( bearPower > -2.62604 )
								if( bullPower <= -1.9196 )
									ret := -0.750000 // sell
								if( bullPower > -1.9196 )
									ret := 0.566667
						if( bearPower > -2.37213 )
							if( bbp <= -2.62688 )
								if( VIP_VIM <= -0.649432 )
									ret := -0.520270
								if( VIP_VIM > -0.649432 )
									ret := 0.800000 // buy
							if( bbp > -2.62688 )
								if( bbm <= 0.64995 )
									ret := 0.413793
								if( bbm > 0.64995 )
									ret := -0.185185
				if( VIP > 0.640564 )
					if( VIP_VIM <= -0.788551 )
						if( bbp <= -5.56227 )
							ret := -0.500000
						if( bbp > -5.56227 )
							if( bullPower <= -0.186052 )
								if( bullPower <= -0.938637 )
									ret := 0.545455
								if( bullPower > -0.938637 )
									ret := 0.826087 // buy
							if( bullPower > -0.186052 )
								if( VIP_VIM <= -0.831273 )
									ret := 0.625000
								if( VIP_VIM > -0.831273 )
									ret := -0.200000
					if( VIP_VIM > -0.788551 )
						if( VIM <= 1.17541 )
							if( bullPower <= -1.02556 )
								if( VIP <= 0.969813 )
									ret := -0.537500
								if( VIP > 0.969813 )
									ret := 0.909091 // buy
							if( bullPower > -1.02556 )
								if( VIM <= 1.01537 )
									ret := 0.118644
								if( VIM > 1.01537 )
									ret := 0.002339
						if( VIM > 1.17541 )
							if( VIM <= 1.4076 )
								if( bullPower <= -1.36295 )
									ret := 0.344173
								if( bullPower > -1.36295 )
									ret := 0.089822
							if( VIM > 1.4076 )
								if( bbp <= -4.60392 )
									ret := -0.820513 // sell
								if( bbp > -4.60392 )
									ret := -0.031746
		if( bbm > 1.97637 )
			if( bbp <= -0.43024 )
				if( bearPower <= -2.05272 )
					if( bearPower <= -2.24672 )
						if( bullPower <= -2.53369 )
							if( VIP <= 0.774754 )
								if( VIP_VIM <= -0.753109 )
									ret := 0.928571 // buy
								if( VIP_VIM > -0.753109 )
									ret := 1.000000 // buy
							if( VIP > 0.774754 )
								if( bbm <= 2.45377 )
									ret := 1.000000 // buy
								if( bbm > 2.45377 )
									ret := 0.142857
						if( bullPower > -2.53369 )
							if( bbp <= -5.79969 )
								if( VIP <= 0.436248 )
									ret := 0.750000 // buy
								if( VIP > 0.436248 )
									ret := -0.343750
							if( bbp > -5.79969 )
								if( VIM <= 0.806267 )
									ret := -0.571429
								if( VIM > 0.806267 )
									ret := 0.398950
					if( bearPower > -2.24672 )
						if( VIP <= 0.727299 )
							if( bullPower <= 0.511251 )
								if( bullPower <= 0.060888 )
									ret := -0.750000 // sell
								if( bullPower > 0.060888 )
									ret := 0.500000
							if( bullPower > 0.511251 )
								ret := -1.000000 // sell
						if( VIP > 0.727299 )
							if( bullPower <= 0.545308 )
								if( VIM <= 1.02839 )
									ret := -0.758621 // sell
								if( VIM > 1.02839 )
									ret := 0.294118
							if( bullPower > 0.545308 )
								if( bbm <= 3.5828 )
									ret := 0.863636 // buy
								if( bbm > 3.5828 )
									ret := 0.000000
				if( bearPower > -2.05272 )
					if( VIP_VIM <= 0.039055 )
						if( bbp <= -0.546988 )
							if( bbp <= -0.873607 )
								if( bearPower <= -1.85672 )
									ret := 0.830986 // buy
								if( bearPower > -1.85672 )
									ret := 0.258427
							if( bbp > -0.873607 )
								if( bearPower <= -1.47338 )
									ret := 0.920000 // buy
								if( bearPower > -1.47338 )
									ret := 0.333333
						if( bbp > -0.546988 )
							if( VIP <= 0.90329 )
								if( VIM <= 0.938347 )
									ret := 1.000000 // buy
								if( VIM > 0.938347 )
									ret := -0.363636
							if( VIP > 0.90329 )
								ret := -0.800000 // sell
					if( VIP_VIM > 0.039055 )
						if( VIM <= 0.862297 )
							if( bbp <= -0.83498 )
								ret := 0.000000
							if( bbp > -0.83498 )
								if( bullPower <= 1.05868 )
									ret := 0.500000
								if( bullPower > 1.05868 )
									ret := 1.000000 // buy
						if( VIM > 0.862297 )
							if( bbm <= 2.575 )
								if( bbm <= 2.23666 )
									ret := -0.111111
								if( bbm > 2.23666 )
									ret := -1.000000 // sell
							if( bbm > 2.575 )
								ret := 0.333333
			if( bbp > -0.43024 )
				if( VIM <= 0.875209 )
					if( bullPower <= 1.13794 )
						ret := 0.250000
					if( bullPower > 1.13794 )
						ret := -0.250000
				if( VIM > 0.875209 )
					if( bullPower <= 1.32738 )
						if( VIP_VIM <= -0.193533 )
							ret := -0.857143 // sell
						if( VIP_VIM > -0.193533 )
							ret := -1.000000 // sell
					if( bullPower > 1.32738 )
						ret := -0.500000
	if( bbp > -0.334228 )
		if( bbp <= 2.07798 )
			if( VIM <= 2.16456 )
				if( VIP_VIM <= 0.757579 )
					if( VIP <= 0.870316 )
						if( bbm <= 0.506867 )
							if( bearPower <= -0.376285 )
								if( VIM <= 1.17346 )
									ret := 0.869565 // buy
								if( VIM > 1.17346 )
									ret := 0.000000
							if( bearPower > -0.376285 )
								if( VIP <= 0.850357 )
									ret := 0.054974
								if( VIP > 0.850357 )
									ret := -0.189427
						if( bbm > 0.506867 )
							if( VIM <= 0.932672 )
								if( BBPower_Color <= 0.5 )
									ret := 0.956522 // buy
								if( BBPower_Color > 0.5 )
									ret := -0.116667
							if( VIM > 0.932672 )
								if( bearPower <= -0.840102 )
									ret := -0.597015
								if( bearPower > -0.840102 )
									ret := -0.216471
					if( VIP > 0.870316 )
						if( bbp <= -0.303745 )
							if( VIM <= 1.14072 )
								if( VIP_VIM <= -0.142543 )
									ret := -0.378151
								if( VIP_VIM > -0.142543 )
									ret := -0.117493
							if( VIM > 1.14072 )
								if( VIM <= 1.31114 )
									ret := 0.250000
								if( VIM > 1.31114 )
									ret := -0.158228
						if( bbp > -0.303745 )
							if( bearPower <= -0.024901 )
								if( VIM <= 0.877326 )
									ret := -0.026777
								if( VIM > 0.877326 )
									ret := 0.082144
							if( bearPower > -0.024901 )
								if( VIP <= 0.940554 )
									ret := -0.309524
								if( VIP > 0.940554 )
									ret := 0.038523
				if( VIP_VIM > 0.757579 )
					if( bbp <= 1.74414 )
						if( bullPower <= 0.592531 )
							if( VIP <= 1.45342 )
								if( bbp <= 0.423228 )
									ret := 1.000000 // buy
								if( bbp > 0.423228 )
									ret := 0.235294
							if( VIP > 1.45342 )
								if( bearPower <= -0.091647 )
									ret := 0.272727
								if( bearPower > -0.091647 )
									ret := -0.067757
						if( bullPower > 0.592531 )
							if( VIP <= 1.6165 )
								if( VIP_VIM <= 0.797509 )
									ret := -0.313253
								if( VIP_VIM > 0.797509 )
									ret := 0.036036
							if( VIP > 1.6165 )
								if( VIP <= 2.92798 )
									ret := -0.401384
								if( VIP > 2.92798 )
									ret := 0.136364
					if( bbp > 1.74414 )
						if( VIM <= 1.0887 )
							if( bearPower <= 0.725349 )
								if( bullPower <= 1.16242 )
									ret := 0.880000 // buy
								if( bullPower > 1.16242 )
									ret := 0.310345
							if( bearPower > 0.725349 )
								if( VIP <= 1.87478 )
									ret := -0.020408
								if( VIP > 1.87478 )
									ret := 0.571429
						if( VIM > 1.0887 )
							if( VIP_VIM <= 0.821281 )
								ret := -1.000000 // sell
							if( VIP_VIM > 0.821281 )
								if( bbm <= 0.237466 )
									ret := -0.214286
								if( bbm > 0.237466 )
									ret := -0.714286 // sell
			if( VIM > 2.16456 )
				if( bearPower <= 0.394724 )
					if( VIM <= 2.81414 )
						if( VIP_VIM <= -0.594506 )
							if( bullPower <= 0.145296 )
								if( bbp <= -0.243923 )
									ret := -0.274510
								if( bbp > -0.243923 )
									ret := 0.079096
							if( bullPower > 0.145296 )
								if( bbp <= 0.441772 )
									ret := 0.608696
								if( bbp > 0.441772 )
									ret := 0.230769
						if( VIP_VIM > -0.594506 )
							if( VIP <= 2.30302 )
								if( bearPower <= 0.124926 )
									ret := -0.189189
								if( bearPower > 0.124926 )
									ret := -0.472973
							if( VIP > 2.30302 )
								if( bbp <= 1.00194 )
									ret := -0.065359
								if( bbp > 1.00194 )
									ret := -0.800000 // sell
					if( VIM > 2.81414 )
						if( VIM <= 61.0707 )
							if( bullPower <= 0.182749 )
								if( VIP <= 2.43821 )
									ret := -0.191358
								if( VIP > 2.43821 )
									ret := 0.030276
							if( bullPower > 0.182749 )
								if( bbp <= 0.795664 )
									ret := 0.127389
								if( bbp > 0.795664 )
									ret := 0.514286
						if( VIM > 61.0707 )
							ret := -1.000000 // sell
				if( bearPower > 0.394724 )
					if( VIP_VIM <= -0.602005 )
						if( VIM <= 3.94416 )
							if( VIP <= 1.717 )
								if( bearPower <= 0.672064 )
									ret := 0.333333
								if( bearPower > 0.672064 )
									ret := -1.000000 // sell
							if( VIP > 1.717 )
								if( VIP <= 2.45927 )
									ret := 0.826087 // buy
								if( VIP > 2.45927 )
									ret := 0.250000
						if( VIM > 3.94416 )
							if( bullPower <= 0.470719 )
								ret := -0.750000 // sell
							if( bullPower > 0.470719 )
								if( VIM <= 6.6337 )
									ret := 0.000000
								if( VIM > 6.6337 )
									ret := -0.250000
					if( VIP_VIM > -0.602005 )
						if( VIP <= 9.24511 )
							if( VIP <= 2.00527 )
								if( VIP_VIM <= -0.412371 )
									ret := 0.500000
								if( VIP_VIM > -0.412371 )
									ret := -0.200000
							if( VIP > 2.00527 )
								if( VIP_VIM <= 0.907862 )
									ret := -0.389027
								if( VIP_VIM > 0.907862 )
									ret := -0.152941
						if( VIP > 9.24511 )
							if( VIP <= 10.671 )
								if( VIP_VIM <= 0.401539 )
									ret := 0.937500 // buy
								if( VIP_VIM > 0.401539 )
									ret := 0.375000
							if( VIP > 10.671 )
								if( bbp <= 0.945741 )
									ret := -1.000000 // sell
								if( bbp > 0.945741 )
									ret := 0.000000
		if( bbp > 2.07798 )
			if( bearPower <= 0.796833 )
				if( VIM <= 0.814425 )
					if( bbp <= 6.53486 )
						if( bullPower <= 2.6134 )
							if( VIM <= 0.604669 )
								if( bbm <= 2.055 )
									ret := -0.352941
								if( bbm > 2.055 )
									ret := -1.000000 // sell
							if( VIM > 0.604669 )
								if( bullPower <= 2.21013 )
									ret := -0.052273
								if( bullPower > 2.21013 )
									ret := -0.444444
						if( bullPower > 2.6134 )
							if( bbm <= 5.96281 )
								if( bbm <= 4.117 )
									ret := 0.155844
								if( bbm > 4.117 )
									ret := 0.807692 // buy
							if( bbm > 5.96281 )
								if( bbp <= 5.48397 )
									ret := -0.764706 // sell
								if( bbp > 5.48397 )
									ret := 0.000000
					if( bbp > 6.53486 )
						if( VIP <= 1.12915 )
							ret := -1.000000 // sell
						if( VIP > 1.12915 )
							ret := -0.500000
				if( VIM > 0.814425 )
					if( bullPower <= 1.96608 )
						if( bbm <= 0.915 )
							if( VIM <= 0.887175 )
								if( VIP <= 1.1674 )
									ret := -0.357143
								if( VIP > 1.1674 )
									ret := -0.928571 // sell
							if( VIM > 0.887175 )
								if( bbp <= 2.28773 )
									ret := -0.041667
								if( bbp > 2.28773 )
									ret := 1.000000 // buy
						if( bbm > 0.915 )
							if( bbp <= 2.35986 )
								if( VIP_VIM <= 0.141738 )
									ret := -0.411765
								if( VIP_VIM > 0.141738 )
									ret := -0.840909 // sell
							if( bbp > 2.35986 )
								if( bearPower <= 0.637109 )
									ret := 0.187500
								if( bearPower > 0.637109 )
									ret := -0.725000 // sell
					if( bullPower > 1.96608 )
						if( bearPower <= -0.336146 )
							if( bullPower <= 3.05196 )
								if( bbp <= 2.33734 )
									ret := -1.000000 // sell
								if( bbp > 2.33734 )
									ret := 1.000000 // buy
							if( bullPower > 3.05196 )
								if( VIM <= 0.837043 )
									ret := 1.000000 // buy
								if( VIM > 0.837043 )
									ret := 0.714286 // buy
						if( bearPower > -0.336146 )
							if( bearPower <= 0.017954 )
								if( VIP <= 0.979806 )
									ret := 0.250000
								if( VIP > 0.979806 )
									ret := -0.958333 // sell
							if( bearPower > 0.017954 )
								if( VIP <= 1.05205 )
									ret := -0.684211
								if( VIP > 1.05205 )
									ret := 0.192308
			if( bearPower > 0.796833 )
				if( bullPower <= 2.82766 )
					if( bbm <= 0.860797 )
						if( bearPower <= 0.892917 )
							if( VIP <= 1.44881 )
								if( VIP_VIM <= 0.393548 )
									ret := 0.033898
								if( VIP_VIM > 0.393548 )
									ret := 0.328859
							if( VIP > 1.44881 )
								if( bbp <= 2.25003 )
									ret := 0.000000
								if( bbp > 2.25003 )
									ret := -0.625000
						if( bearPower > 0.892917 )
							if( bullPower <= 2.05821 )
								if( bullPower <= 1.90835 )
									ret := -0.030462
								if( bullPower > 1.90835 )
									ret := -0.392157
							if( bullPower > 2.05821 )
								if( VIP_VIM <= 0.803949 )
									ret := 0.304688
								if( VIP_VIM > 0.803949 )
									ret := -0.170732
					if( bbm > 0.860797 )
						if( bearPower <= 0.969586 )
							if( bbm <= 1.405 )
								if( bbp <= 2.71914 )
									ret := -0.444444
								if( bbp > 2.71914 )
									ret := 0.066116
							if( bbm > 1.405 )
								if( VIM <= 0.875862 )
									ret := 0.740000 // buy
								if( VIM > 0.875862 )
									ret := -0.500000
						if( bearPower > 0.969586 )
							if( VIP_VIM <= 0.615961 )
								if( VIP <= 1.24489 )
									ret := -0.321168
								if( VIP > 1.24489 )
									ret := -0.660000
							if( VIP_VIM > 0.615961 )
								if( bearPower <= 1.46997 )
									ret := 0.236842
								if( bearPower > 1.46997 )
									ret := -0.851852 // sell
				if( bullPower > 2.82766 )
					if( bbm <= 2.55473 )
						if( VIM <= 0.559797 )
							if( bbp <= 12.6231 )
								if( bullPower <= 4.0618 )
									ret := -0.291667
								if( bullPower > 4.0618 )
									ret := -0.933333 // sell
							if( bbp > 12.6231 )
								if( bbp <= 12.8097 )
									ret := 0.500000
								if( bbp > 12.8097 )
									ret := 1.000000 // buy
						if( VIM > 0.559797 )
							if( bullPower <= 3.26735 )
								if( bullPower <= 3.0447 )
									ret := 0.211765
								if( bullPower > 3.0447 )
									ret := 0.591549
							if( bullPower > 3.26735 )
								if( bbm <= 1.29445 )
									ret := 0.428571
								if( bbm > 1.29445 )
									ret := -0.333333
					if( bbm > 2.55473 )
						if( VIP_VIM <= 0.282527 )
							ret := -0.500000
						if( VIP_VIM > 0.282527 )
							if( bullPower <= 5.14776 )
								if( bbp <= 6.29179 )
									ret := 0.952381 // buy
								if( bbp > 6.29179 )
									ret := 0.500000
							if( bullPower > 5.14776 )
								if( VIM <= 0.674957 )
									ret := 0.800000 // buy
								if( VIM > 0.674957 )
									ret := -0.714286 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bull_Bear_Power 
//@version=5
//indicator "Bull Bear Power", shorttitle="BBP")
lengthInput = input.int(13, title="Length")
bullPower = high - ta.ema(close, lengthInput)
bearPower = low - ta.ema(close, lengthInput)
bbp = bullPower + bearPower

bbm = bullPower - bearPower

plot(bbp, color = bbp >= 0 ? #089981 : #f23645, title="BBPower", style = plot.style_columns)
hline(0, "Zero line")

BBPower_Color = bbp >= 0  ? 1: 0


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
float op_operation = decision_tree_0_MSFT_5Min_f8cb5e4d(bearPower, bbm, bbp, bullPower, BBPower_Color, VIP, VIP_VIM, VIM)

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


