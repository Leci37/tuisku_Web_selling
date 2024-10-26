//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Vortex_Indicator
// ID_model: SNAP_1Min_2BV0_94a8bd5c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SNAP_1Min_2BV0_94a8bd5c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SNAP_1Min_94a8bd5c(bbm, bearPower, bbp, bullPower, BBPower_Color, VIP_VIM, VIM, VIP)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bullPower <= -0.007581 )
		if( VIM <= 1.65145 )
			if( bullPower <= -0.112856 )
				if( VIP <= 0.639167 )
					if( bbp <= -0.833339 )
						if( bullPower <= -0.276495 )
							if( VIM <= 1.45766 )
								ret := 1.000000 // buy
							if( VIM > 1.45766 )
								if( VIM <= 1.46792 )
									ret := 0.750000 // buy
								if( VIM > 1.46792 )
									ret := 1.000000 // buy
						if( bullPower > -0.276495 )
							ret := 0.500000
					if( bbp > -0.833339 )
						if( VIM <= 1.47751 )
							if( bbp <= -0.313448 )
								if( VIM <= 1.37339 )
									ret := -1.000000 // sell
								if( VIM > 1.37339 )
									ret := -0.350000
							if( bbp > -0.313448 )
								if( VIP_VIM <= -0.799937 )
									ret := 0.750000 // buy
								if( VIP_VIM > -0.799937 )
									ret := 0.000000
						if( VIM > 1.47751 )
							if( bullPower <= -0.200271 )
								ret := 0.000000
							if( bullPower > -0.200271 )
								if( bbm <= 0.031741 )
									ret := 0.250000
								if( bbm > 0.031741 )
									ret := 1.000000 // buy
				if( VIP > 0.639167 )
					if( bbm <= 0.041726 )
						if( bullPower <= -0.117119 )
							if( bbm <= 0.022804 )
								ret := 1.000000 // buy
							if( bbm > 0.022804 )
								ret := 0.750000 // buy
						if( bullPower > -0.117119 )
							ret := -0.500000
					if( bbm > 0.041726 )
						if( VIM <= 1.32145 )
							ret := 1.000000 // buy
						if( VIM > 1.32145 )
							if( bullPower <= -0.161699 )
								ret := 1.000000 // buy
							if( bullPower > -0.161699 )
								if( bullPower <= -0.123615 )
									ret := 0.000000
								if( bullPower > -0.123615 )
									ret := 0.900000 // buy
			if( bullPower > -0.112856 )
				if( VIP <= 0.930094 )
					if( bbm <= 0.030741 )
						if( bbp <= -0.092329 )
							if( VIM <= 1.56822 )
								if( bbm <= 0.024079 )
									ret := -0.283333
								if( bbm > 0.024079 )
									ret := 0.008065
							if( VIM > 1.56822 )
								if( VIP <= 0.861556 )
									ret := 0.742857 // buy
								if( VIP > 0.861556 )
									ret := -0.714286 // sell
						if( bbp > -0.092329 )
							if( bbm <= 0.023662 )
								if( VIP_VIM <= -0.302472 )
									ret := 0.053817
								if( VIP_VIM > -0.302472 )
									ret := -0.040628
							if( bbm > 0.023662 )
								if( VIP_VIM <= -0.244594 )
									ret := -0.090264
								if( VIP_VIM > -0.244594 )
									ret := 0.232877
					if( bbm > 0.030741 )
						if( bearPower <= -0.054551 )
							if( bullPower <= -0.078555 )
								if( VIM <= 1.46916 )
									ret := -0.385827
								if( VIM > 1.46916 )
									ret := 0.629630
							if( bullPower > -0.078555 )
								if( VIM <= 1.39007 )
									ret := 0.140717
								if( VIM > 1.39007 )
									ret := 0.447853
						if( bearPower > -0.054551 )
							if( VIP <= 0.659698 )
								if( VIP <= 0.631364 )
									ret := 0.181818
								if( VIP > 0.631364 )
									ret := 1.000000 // buy
							if( VIP > 0.659698 )
								if( VIM <= 1.07013 )
									ret := 0.523810
								if( VIM > 1.07013 )
									ret := -0.186047
				if( VIP > 0.930094 )
					if( bbm <= 0.004899 )
						if( bearPower <= -0.0915 )
							ret := -0.857143 // sell
						if( bearPower > -0.0915 )
							if( bbp <= -0.031479 )
								if( VIM <= 1.64691 )
									ret := 0.514451
								if( VIM > 1.64691 )
									ret := -1.000000 // sell
							if( bbp > -0.031479 )
								if( VIP <= 1.3275 )
									ret := 0.092391
								if( VIP > 1.3275 )
									ret := 0.447205
					if( bbm > 0.004899 )
						if( bearPower <= -0.088456 )
							if( bearPower <= -0.184289 )
								if( bbp <= -0.23862 )
									ret := 1.000000 // buy
								if( bbp > -0.23862 )
									ret := 0.500000
							if( bearPower > -0.184289 )
								if( VIM <= 1.08665 )
									ret := 0.000000
								if( VIM > 1.08665 )
									ret := -0.596491
						if( bearPower > -0.088456 )
							if( bbm <= 0.015002 )
								if( VIP <= 1.04214 )
									ret := -0.021154
								if( VIP > 1.04214 )
									ret := 0.229508
							if( bbm > 0.015002 )
								if( VIM <= 1.5257 )
									ret := 0.249150
								if( VIM > 1.5257 )
									ret := -0.351351
		if( VIM > 1.65145 )
			if( bbp <= -0.030579 )
				if( VIP <= 1.46459 )
					if( VIP <= 0.875682 )
						if( bbm <= 0.001092 )
							if( VIP <= 0.724084 )
								if( VIP_VIM <= -1.21405 )
									ret := 0.571429
								if( VIP_VIM > -1.21405 )
									ret := -0.833333 // sell
							if( VIP > 0.724084 )
								if( VIM <= 1.97006 )
									ret := 0.625000
								if( VIM > 1.97006 )
									ret := 1.000000 // buy
						if( bbm > 0.001092 )
							if( VIM <= 2.05576 )
								if( VIP <= 0.789257 )
									ret := 0.954545 // buy
								if( VIP > 0.789257 )
									ret := 0.689655
							if( VIM > 2.05576 )
								ret := 0.166667
					if( VIP > 0.875682 )
						if( VIM <= 2.22294 )
							if( VIP <= 1.37193 )
								if( VIP <= 1.08207 )
									ret := 0.022989
								if( VIP > 1.08207 )
									ret := 0.473684
							if( VIP > 1.37193 )
								if( bbm <= 0.015464 )
									ret := 0.000000
								if( bbm > 0.015464 )
									ret := -0.944444 // sell
						if( VIM > 2.22294 )
							if( bbp <= -0.041693 )
								if( VIM <= 3.14738 )
									ret := -0.506024
								if( VIM > 3.14738 )
									ret := 1.000000 // buy
							if( bbp > -0.041693 )
								if( VIP <= 1.41903 )
									ret := 0.846154 // buy
								if( VIP > 1.41903 )
									ret := 0.250000
				if( VIP > 1.46459 )
					if( bullPower <= -0.025509 )
						if( bbm <= 0.009994 )
							if( VIM <= 10.9934 )
								if( VIP <= 8.31001 )
									ret := 0.587533
								if( VIP > 8.31001 )
									ret := -0.235294
							if( VIM > 10.9934 )
								if( VIM <= 18.8442 )
									ret := 0.896825 // buy
								if( VIM > 18.8442 )
									ret := 0.441176
						if( bbm > 0.009994 )
							if( VIM <= 2.02083 )
								if( bbm <= 0.015478 )
									ret := 0.200000
								if( bbm > 0.015478 )
									ret := 0.941176 // buy
							if( VIM > 2.02083 )
								if( VIM <= 2.65454 )
									ret := -0.142857
								if( VIM > 2.65454 )
									ret := 0.349057
					if( bullPower > -0.025509 )
						if( VIM <= 3.03691 )
							if( VIP_VIM <= 0.268312 )
								if( VIP_VIM <= -0.447652 )
									ret := 0.426357
								if( VIP_VIM > -0.447652 )
									ret := 0.656863
							if( VIP_VIM > 0.268312 )
								if( bbm <= 0.005362 )
									ret := 0.418919
								if( bbm > 0.005362 )
									ret := -0.208333
						if( VIM > 3.03691 )
							if( VIM <= 3.49603 )
								if( VIM <= 3.3299 )
									ret := 0.403226
								if( VIM > 3.3299 )
									ret := -0.325000
							if( VIM > 3.49603 )
								if( VIM <= 3.64364 )
									ret := 0.770833 // buy
								if( VIM > 3.64364 )
									ret := 0.359209
			if( bbp > -0.030579 )
				if( VIP_VIM <= -1.293 )
					if( VIM <= 17.7558 )
						if( VIM <= 11.5006 )
							if( VIP_VIM <= -1.83058 )
								if( VIP <= 7.7698 )
									ret := 0.173913
								if( VIP > 7.7698 )
									ret := 0.842105 // buy
							if( VIP_VIM > -1.83058 )
								if( VIP_VIM <= -1.74315 )
									ret := -1.000000 // sell
								if( VIP_VIM > -1.74315 )
									ret := -0.191489
						if( VIM > 11.5006 )
							if( bullPower <= -0.013119 )
								ret := -1.000000 // sell
							if( bullPower > -0.013119 )
								if( VIP <= 11.0825 )
									ret := -0.636364
								if( VIP > 11.0825 )
									ret := 0.400000
					if( VIM > 17.7558 )
						if( bbp <= -0.018246 )
							if( VIP_VIM <= -1.99578 )
								if( VIM <= 114.833 )
									ret := 0.250000
								if( VIM > 114.833 )
									ret := 0.250000
							if( VIP_VIM > -1.99578 )
								ret := 1.000000 // buy
						if( bbp > -0.018246 )
							ret := 0.000000
				if( VIP_VIM > -1.293 )
					if( VIM <= 644.594 )
						if( VIP <= 3.66585 )
							if( bbm <= 0.000209 )
								if( VIP_VIM <= -0.736414 )
									ret := 0.010753
								if( VIP_VIM > -0.736414 )
									ret := 0.276231
							if( bbm > 0.000209 )
								if( VIM <= 1.69654 )
									ret := -0.111111
								if( VIM > 1.69654 )
									ret := 0.510490
						if( VIP > 3.66585 )
							if( bullPower <= -0.014806 )
								if( bullPower <= -0.015154 )
									ret := 0.333333
								if( bullPower > -0.015154 )
									ret := 0.857143 // buy
							if( bullPower > -0.014806 )
								if( VIP_VIM <= 0.363928 )
									ret := 0.366748
								if( VIP_VIM > 0.363928 )
									ret := 0.510870
					if( VIM > 644.594 )
						if( bbp <= -0.020842 )
							if( VIM <= 999.084 )
								ret := -0.750000 // sell
							if( VIM > 999.084 )
								ret := 0.500000
						if( bbp > -0.020842 )
							if( VIP <= 898.848 )
								ret := -1.000000 // sell
							if( VIP > 898.848 )
								ret := -0.250000
	if( bullPower > -0.007581 )
		if( bearPower <= 0.011251 )
			if( bbp <= 0.057516 )
				if( VIM <= 0.665252 )
					if( bbm <= 0.01565 )
						if( VIM <= 0.661416 )
							if( bearPower <= 0.010181 )
								ret := 0.000000
							if( bearPower > 0.010181 )
								ret := 0.250000
						if( VIM > 0.661416 )
							ret := -0.250000
					if( bbm > 0.01565 )
						if( VIP_VIM <= 0.573909 )
							if( VIP_VIM <= 0.557029 )
								ret := -0.166667
							if( VIP_VIM > 0.557029 )
								ret := 0.600000
						if( VIP_VIM > 0.573909 )
							if( VIP <= 1.29547 )
								if( bearPower <= 0.005824 )
									ret := -0.750000 // sell
								if( bearPower > 0.005824 )
									ret := -0.400000
							if( VIP > 1.29547 )
								if( VIP_VIM <= 0.752808 )
									ret := -0.030303
								if( VIP_VIM > 0.752808 )
									ret := -0.705882 // sell
				if( VIM > 0.665252 )
					if( bbp <= -0.167681 )
						if( bearPower <= -0.242037 )
							if( VIP_VIM <= -0.319071 )
								if( VIP_VIM <= -0.547724 )
									ret := 1.000000 // buy
								if( VIP_VIM > -0.547724 )
									ret := -0.307692
							if( VIP_VIM > -0.319071 )
								ret := 1.000000 // buy
						if( bearPower > -0.242037 )
							if( bbm <= 0.186343 )
								ret := 0.500000
							if( bbm > 0.186343 )
								ret := 1.000000 // buy
					if( bbp > -0.167681 )
						if( bearPower <= -0.095755 )
							if( VIM <= 1.74804 )
								if( bearPower <= -0.101801 )
									ret := -0.289157
								if( bearPower > -0.101801 )
									ret := -0.757576 // sell
							if( VIM > 1.74804 )
								ret := 0.714286 // buy
						if( bearPower > -0.095755 )
							if( VIP_VIM <= 1.4653 )
								if( VIP_VIM <= 0.274484 )
									ret := 0.057600
								if( VIP_VIM > 0.274484 )
									ret := 0.007513
							if( VIP_VIM > 1.4653 )
								if( bearPower <= 0.000369 )
									ret := 0.490909
								if( bearPower > 0.000369 )
									ret := 0.131737
			if( bbp > 0.057516 )
				if( bullPower <= 0.073153 )
					if( VIM <= 0.692359 )
						if( VIP_VIM <= 0.567273 )
							if( VIP <= 1.1866 )
								if( bullPower <= 0.059861 )
									ret := 0.000000
								if( bullPower > 0.059861 )
									ret := 0.833333 // buy
							if( VIP > 1.1866 )
								ret := 1.000000 // buy
						if( VIP_VIM > 0.567273 )
							if( bbp <= 0.061044 )
								ret := 0.857143 // buy
							if( bbp > 0.061044 )
								if( bbp <= 0.072739 )
									ret := -0.357143
								if( bbp > 0.072739 )
									ret := 0.750000 // buy
					if( VIM > 0.692359 )
						if( bbp <= 0.066343 )
							if( VIP <= 1.03582 )
								if( bearPower <= 0.006547 )
									ret := 0.483871
								if( bearPower > 0.006547 )
									ret := -0.642857
							if( VIP > 1.03582 )
								if( bearPower <= 0.0005 )
									ret := -0.666667
								if( bearPower > 0.0005 )
									ret := -0.281481
						if( bbp > 0.066343 )
							if( bullPower <= 0.065627 )
								if( VIP_VIM <= 0.518766 )
									ret := 0.432836
								if( VIP_VIM > 0.518766 )
									ret := -0.800000 // sell
							if( bullPower > 0.065627 )
								if( VIP_VIM <= 0.191568 )
									ret := -0.350000
								if( VIP_VIM > 0.191568 )
									ret := 0.133333
				if( bullPower > 0.073153 )
					if( VIP <= 1.36475 )
						if( bullPower <= 2.28066 )
							if( bearPower <= -0.065238 )
								if( VIP <= 0.889621 )
									ret := -0.750000 // sell
								if( VIP > 0.889621 )
									ret := -1.000000 // sell
							if( bearPower > -0.065238 )
								if( bearPower <= -0.038445 )
									ret := 0.343750
								if( bearPower > -0.038445 )
									ret := -0.253731
						if( bullPower > 2.28066 )
							ret := 1.000000 // buy
					if( VIP > 1.36475 )
						if( VIM <= 1.25845 )
							if( VIM <= 1.23193 )
								if( bearPower <= 0.000196 )
									ret := -0.880000 // sell
								if( bearPower > 0.000196 )
									ret := -0.125000
							if( VIM > 1.23193 )
								ret := 0.750000 // buy
						if( VIM > 1.25845 )
							ret := -1.000000 // sell
		if( bearPower > 0.011251 )
			if( VIM <= 1.00354 )
				if( bullPower <= 0.094597 )
					if( VIM <= 0.456749 )
						if( VIM <= 0.438596 )
							if( VIM <= 0.405861 )
								if( bbp <= 0.128012 )
									ret := -0.916667 // sell
								if( bbp > 0.128012 )
									ret := -0.333333
							if( VIM > 0.405861 )
								if( bbm <= 0.028419 )
									ret := -0.272727
								if( bbm > 0.028419 )
									ret := 0.750000 // buy
						if( VIM > 0.438596 )
							if( bbp <= 0.109395 )
								ret := -0.250000
							if( bbp > 0.109395 )
								if( VIM <= 0.449875 )
									ret := -1.000000 // sell
								if( VIM > 0.449875 )
									ret := -0.750000 // sell
					if( VIM > 0.456749 )
						if( bearPower <= 0.020815 )
							if( bullPower <= 0.081651 )
								if( VIP <= 1.05558 )
									ret := 0.230000
								if( VIP > 1.05558 )
									ret := -0.031631
							if( bullPower > 0.081651 )
								if( bullPower <= 0.087964 )
									ret := -0.656250
								if( bullPower > 0.087964 )
									ret := -0.043478
						if( bearPower > 0.020815 )
							if( VIP_VIM <= 1.35723 )
								if( bbm <= 0.004813 )
									ret := -0.217391
								if( bbm > 0.004813 )
									ret := 0.073202
							if( VIP_VIM > 1.35723 )
								if( VIM <= 0.86087 )
									ret := -0.750000 // sell
								if( VIM > 0.86087 )
									ret := -1.000000 // sell
				if( bullPower > 0.094597 )
					if( bbm <= 0.525104 )
						if( VIP <= 1.13227 )
							if( VIP_VIM <= 0.048863 )
								if( bbm <= 0.108546 )
									ret := 1.000000 // buy
								if( bbm > 0.108546 )
									ret := -0.833333 // sell
							if( VIP_VIM > 0.048863 )
								if( bbm <= 0.110387 )
									ret := -0.583333
								if( bbm > 0.110387 )
									ret := -1.000000 // sell
						if( VIP > 1.13227 )
							if( VIP_VIM <= 0.299557 )
								if( bbm <= 0.171222 )
									ret := 0.750000 // buy
								if( bbm > 0.171222 )
									ret := -1.000000 // sell
							if( VIP_VIM > 0.299557 )
								if( bullPower <= 0.329074 )
									ret := -0.158291
								if( bullPower > 0.329074 )
									ret := -0.884615 // sell
					if( bbm > 0.525104 )
						ret := 1.000000 // buy
			if( VIM > 1.00354 )
				if( VIP <= 5.85882 )
					if( bearPower <= 0.02863 )
						if( bbp <= 0.031329 )
							if( VIM <= 2.21423 )
								if( VIP_VIM <= -0.692338 )
									ret := -1.000000 // sell
								if( VIP_VIM > -0.692338 )
									ret := 0.118012
							if( VIM > 2.21423 )
								if( VIP <= 3.73026 )
									ret := -0.341121
								if( VIP > 3.73026 )
									ret := 0.116788
						if( bbp > 0.031329 )
							if( bullPower <= 0.069829 )
								if( bbp <= 0.090099 )
									ret := -0.155018
								if( bbp > 0.090099 )
									ret := 0.800000 // buy
							if( bullPower > 0.069829 )
								if( VIP <= 0.944805 )
									ret := 0.000000
								if( VIP > 0.944805 )
									ret := -0.545455
					if( bearPower > 0.02863 )
						if( VIP <= 4.90288 )
							if( bullPower <= 0.082432 )
								if( VIM <= 1.19932 )
									ret := -0.643478
								if( VIM > 1.19932 )
									ret := -0.343109
							if( bullPower > 0.082432 )
								if( VIP_VIM <= -0.016562 )
									ret := -0.812500 // sell
								if( VIP_VIM > -0.016562 )
									ret := 0.180180
						if( VIP > 4.90288 )
							if( VIP_VIM <= 0.877957 )
								if( VIP_VIM <= -0.248333 )
									ret := -0.500000
								if( VIP_VIM > -0.248333 )
									ret := 0.656250
							if( VIP_VIM > 0.877957 )
								if( VIP_VIM <= 1.14917 )
									ret := -0.666667
								if( VIP_VIM > 1.14917 )
									ret := 0.000000
				if( VIP > 5.85882 )
					if( bbp <= 0.061877 )
						if( bearPower <= 0.012036 )
							if( VIM <= 20.955 )
								if( bullPower <= 0.011573 )
									ret := -0.583333
								if( bullPower > 0.011573 )
									ret := -0.037037
							if( VIM > 20.955 )
								if( bearPower <= 0.011388 )
									ret := 1.000000 // buy
								if( bearPower > 0.011388 )
									ret := 0.461538
						if( bearPower > 0.012036 )
							if( VIM <= 843.972 )
								if( VIM <= 11.3257 )
									ret := -0.429333
								if( VIM > 11.3257 )
									ret := -0.198238
							if( VIM > 843.972 )
								if( bbp <= 0.047019 )
									ret := -1.000000 // sell
								if( bbp > 0.047019 )
									ret := -0.750000 // sell
					if( bbp > 0.061877 )
						if( VIP <= 30.6703 )
							if( bbm <= 1e-06 )
								if( VIM <= 15.0163 )
									ret := -0.535032
								if( VIM > 15.0163 )
									ret := 0.093750
							if( bbm > 1e-06 )
								if( bbm <= 0.00995 )
									ret := -1.000000 // sell
								if( bbm > 0.00995 )
									ret := -0.766667 // sell
						if( VIP > 30.6703 )
							if( VIP <= 817.573 )
								ret := -1.000000 // sell
							if( VIP > 817.573 )
								if( bullPower <= 0.079081 )
									ret := -0.500000
								if( bullPower > 0.079081 )
									ret := -0.857143 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_SNAP_1Min_94a8bd5c(bbm, bearPower, bbp, bullPower, BBPower_Color, VIP_VIM, VIM, VIP)

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


