//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: ADAUSDT_30Min_2BT0_efbe11d8 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADAUSDT_30Min_2BT0_efbe11d8", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADAUSDT_30Min_efbe11d8(bullPower, bbp, bearPower, bbm, BBPower_Color, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bullPower <= -0.003086 )
		if( ema3 <= 0.372925 )
			if( ema12 <= -0.002866 )
				if( ema3 <= 0.31756 )
					if( tema <= 0.279199 )
						if( bullPower <= -0.01587 )
							ret := -0.800000 // sell
						if( bullPower > -0.01587 )
							if( ema3 <= 0.292697 )
								if( tema <= 0.263421 )
									ret := 0.471154
								if( tema > 0.263421 )
									ret := 1.000000 // buy
							if( ema3 > 0.292697 )
								if( tema <= 0.277882 )
									ret := -0.227273
								if( tema > 0.277882 )
									ret := 1.000000 // buy
					if( tema > 0.279199 )
						if( ema12 <= -0.00418 )
							if( ema13 <= -0.011873 )
								ret := 0.571429
							if( ema13 > -0.011873 )
								if( bbm <= 0.00345 )
									ret := 0.000000
								if( bbm > 0.00345 )
									ret := -0.918367 // sell
						if( ema12 > -0.00418 )
							if( tema <= 0.304021 )
								if( bbp <= -0.010306 )
									ret := 1.000000 // buy
								if( bbp > -0.010306 )
									ret := 0.400000
							if( tema > 0.304021 )
								if( bbp <= -0.013894 )
									ret := 0.600000
								if( bbp > -0.013894 )
									ret := -1.000000 // sell
				if( ema3 > 0.31756 )
					if( ema2 <= 0.326568 )
						if( ema3 <= 0.33036 )
							if( ema13 <= -0.005349 )
								ret := 1.000000 // buy
							if( ema13 > -0.005349 )
								ret := 0.750000 // buy
						if( ema3 > 0.33036 )
							ret := 0.500000
					if( ema2 > 0.326568 )
						if( bearPower <= -0.010675 )
							if( bearPower <= -0.027796 )
								if( ema13 <= -0.012463 )
									ret := 0.166667
								if( ema13 > -0.012463 )
									ret := -1.000000 // sell
							if( bearPower > -0.027796 )
								if( ema3 <= 0.335545 )
									ret := -0.095238
								if( ema3 > 0.335545 )
									ret := 0.781065 // buy
						if( bearPower > -0.010675 )
							if( ema1 <= 0.346092 )
								if( ema12 <= -0.006525 )
									ret := -0.750000 // sell
								if( ema12 > -0.006525 )
									ret := 0.596491
							if( ema1 > 0.346092 )
								if( ema3 <= 0.361462 )
									ret := -0.130435
								if( ema3 > 0.361462 )
									ret := 0.440000
			if( ema12 > -0.002866 )
				if( ema3 <= 0.307682 )
					if( ema1 <= 0.153204 )
						if( ema13 <= -0.002827 )
							ret := 1.000000 // buy
						if( ema13 > -0.002827 )
							ret := 0.750000 // buy
					if( ema1 > 0.153204 )
						if( ema1 <= 0.271318 )
							ret := -0.333333
						if( ema1 > 0.271318 )
							if( tema <= 0.273156 )
								ret := 1.000000 // buy
							if( tema > 0.273156 )
								if( ema2 <= 0.291575 )
									ret := 0.083333
								if( ema2 > 0.291575 )
									ret := 0.571429
				if( ema3 > 0.307682 )
					if( bbp <= -0.010694 )
						if( bbp <= -0.014206 )
							if( ema2 <= 0.347151 )
								if( ema1 <= 0.341419 )
									ret := 0.250000
								if( ema1 > 0.341419 )
									ret := 1.000000 // buy
							if( ema2 > 0.347151 )
								if( ema13 <= -0.002862 )
									ret := -0.750000 // sell
								if( ema13 > -0.002862 )
									ret := 0.000000
						if( bbp > -0.014206 )
							if( ema13 <= -0.003377 )
								if( ema13 <= -0.004057 )
									ret := -0.428571
								if( ema13 > -0.004057 )
									ret := -0.928571 // sell
							if( ema13 > -0.003377 )
								if( ema2 <= 0.31611 )
									ret := 0.000000
								if( ema2 > 0.31611 )
									ret := -0.400000
					if( bbp > -0.010694 )
						if( ema13 <= -0.001271 )
							if( ema13 <= -0.002368 )
								if( ema12 <= -0.002751 )
									ret := -0.250000
								if( ema12 > -0.002751 )
									ret := 0.178571
							if( ema13 > -0.002368 )
								ret := -0.333333
						if( ema13 > -0.001271 )
							ret := 0.750000 // buy
		if( ema3 > 0.372925 )
			if( bearPower <= -0.048751 )
				if( bbp <= -0.172188 )
					if( bullPower <= -0.048953 )
						if( ema12 <= -0.057897 )
							if( bbm <= 0.089082 )
								ret := 1.000000 // buy
							if( bbm > 0.089082 )
								if( bbm <= 0.096625 )
									ret := 0.000000
								if( bbm > 0.096625 )
									ret := 0.888889 // buy
						if( ema12 > -0.057897 )
							if( bbm <= 0.070982 )
								if( bbp <= -0.174436 )
									ret := 0.142857
								if( bbp > -0.174436 )
									ret := 1.000000 // buy
							if( bbm > 0.070982 )
								if( bullPower <= -0.056932 )
									ret := 1.000000 // buy
								if( bullPower > -0.056932 )
									ret := 0.666667
					if( bullPower > -0.048953 )
						if( ema3 <= 2.27752 )
							if( ema1 <= 1.64638 )
								if( ema2 <= 1.55124 )
									ret := 0.750000 // buy
								if( ema2 > 1.55124 )
									ret := 1.000000 // buy
							if( ema1 > 1.64638 )
								if( ema1 <= 1.81871 )
									ret := -0.400000
								if( ema1 > 1.81871 )
									ret := 0.875000 // buy
						if( ema3 > 2.27752 )
							if( ema13 <= -0.092962 )
								ret := 0.000000
							if( ema13 > -0.092962 )
								ret := -1.000000 // sell
				if( bbp > -0.172188 )
					if( ema3 <= 0.847033 )
						if( ema12 <= -0.024914 )
							ret := 1.000000 // buy
						if( ema12 > -0.024914 )
							if( tema <= 0.483674 )
								ret := -1.000000 // sell
							if( tema > 0.483674 )
								if( bbp <= -0.063027 )
									ret := 0.944444 // buy
								if( bbp > -0.063027 )
									ret := 0.500000
					if( ema3 > 0.847033 )
						if( ema13 <= -0.045201 )
							if( tema <= 1.21731 )
								if( bbm <= 0.031824 )
									ret := -0.533333
								if( bbm > 0.031824 )
									ret := 0.510000
							if( tema > 1.21731 )
								if( ema1 <= 1.35224 )
									ret := -0.805556 // sell
								if( ema1 > 1.35224 )
									ret := 0.053824
						if( ema13 > -0.045201 )
							if( ema2 <= 1.05669 )
								if( tema <= 0.979877 )
									ret := 0.363636
								if( tema > 0.979877 )
									ret := -0.900000 // sell
							if( ema2 > 1.05669 )
								if( ema2 <= 1.11124 )
									ret := 1.000000 // buy
								if( ema2 > 1.11124 )
									ret := 0.327504
			if( bearPower > -0.048751 )
				if( tema <= 1.33129 )
					if( ema12 <= -0.007647 )
						if( tema <= 0.465458 )
							if( tema <= 0.35011 )
								ret := -1.000000 // sell
							if( tema > 0.35011 )
								if( bbp <= -0.021264 )
									ret := 0.825243 // buy
								if( bbp > -0.021264 )
									ret := 0.111111
						if( tema > 0.465458 )
							if( ema12 <= -0.028898 )
								if( bearPower <= -0.046949 )
									ret := -0.500000
								if( bearPower > -0.046949 )
									ret := -1.000000 // sell
							if( ema12 > -0.028898 )
								if( ema3 <= 1.14837 )
									ret := 0.145082
								if( ema3 > 1.14837 )
									ret := 0.364837
					if( ema12 > -0.007647 )
						if( ema2 <= 0.381214 )
							if( ema12 <= -0.004104 )
								if( ema12 <= -0.006116 )
									ret := -0.111111
								if( ema12 > -0.006116 )
									ret := -0.761905 // sell
							if( ema12 > -0.004104 )
								if( bbm <= 0.003605 )
									ret := -0.035714
								if( bbm > 0.003605 )
									ret := 0.642857
						if( ema2 > 0.381214 )
							if( ema3 <= 0.480492 )
								if( bbm <= 0.003309 )
									ret := -0.065217
								if( bbm > 0.003309 )
									ret := 0.356108
							if( ema3 > 0.480492 )
								if( tema <= 1.31877 )
									ret := 0.031957
								if( tema > 1.31877 )
									ret := 0.627119
				if( tema > 1.33129 )
					if( ema3 <= 2.38025 )
						if( ema2 <= 2.24856 )
							if( ema3 <= 1.64871 )
								if( ema3 <= 1.59448 )
									ret := -0.112346
								if( ema3 > 1.59448 )
									ret := -0.651685
							if( ema3 > 1.64871 )
								if( ema12 <= -0.011459 )
									ret := 0.248649
								if( ema12 > -0.011459 )
									ret := -0.047109
						if( ema2 > 2.24856 )
							if( ema12 <= -0.012365 )
								if( ema3 <= 2.28735 )
									ret := -0.583333
								if( ema3 > 2.28735 )
									ret := -1.000000 // sell
							if( ema12 > -0.012365 )
								if( ema13 <= -0.011034 )
									ret := 0.060606
								if( ema13 > -0.011034 )
									ret := -0.608696
					if( ema3 > 2.38025 )
						if( ema1 <= 2.86575 )
							if( bullPower <= -0.012311 )
								if( ema12 <= -0.015274 )
									ret := 0.953488 // buy
								if( ema12 > -0.015274 )
									ret := 0.550000
							if( bullPower > -0.012311 )
								if( bbm <= 0.0155 )
									ret := -0.133333
								if( bbm > 0.0155 )
									ret := 0.392857
						if( ema1 > 2.86575 )
							if( ema2 <= 2.94185 )
								if( ema12 <= -0.013061 )
									ret := 0.000000
								if( ema12 > -0.013061 )
									ret := -0.695652
							if( ema2 > 2.94185 )
								if( bbm <= 0.0235 )
									ret := 0.000000
								if( bbm > 0.0235 )
									ret := 0.500000
	if( bullPower > -0.003086 )
		if( ema3 <= 0.313875 )
			if( bbm <= 0.00203 )
				if( tema <= 0.09344 )
					if( ema13 <= 0.000158 )
						if( bbm <= 0.00087 )
							if( ema1 <= 0.092846 )
								if( tema <= 0.091726 )
									ret := -0.042553
								if( tema > 0.091726 )
									ret := -0.514706
							if( ema1 > 0.092846 )
								if( ema2 <= 0.093258 )
									ret := 0.555556
								if( ema2 > 0.093258 )
									ret := -0.015385
						if( bbm > 0.00087 )
							if( ema3 <= 0.093927 )
								if( tema <= 0.088849 )
									ret := 0.493827
								if( tema > 0.088849 )
									ret := 0.000000
							if( ema3 > 0.093927 )
								if( bbm <= 0.001125 )
									ret := 0.375000
								if( bbm > 0.001125 )
									ret := 0.829268 // buy
					if( ema13 > 0.000158 )
						if( bearPower <= 0.000112 )
							if( bullPower <= 0.00045 )
								if( bearPower <= -0.000329 )
									ret := 0.655172
								if( bearPower > -0.000329 )
									ret := -0.045455
							if( bullPower > 0.00045 )
								if( ema12 <= 0.000331 )
									ret := 0.831169 // buy
								if( ema12 > 0.000331 )
									ret := 0.480000
						if( bearPower > 0.000112 )
							if( ema13 <= 0.000707 )
								if( tema <= 0.086838 )
									ret := -0.500000
								if( tema > 0.086838 )
									ret := 0.068966
							if( ema13 > 0.000707 )
								if( bullPower <= 0.001507 )
									ret := 0.729167 // buy
								if( bullPower > 0.001507 )
									ret := 0.076923
				if( tema > 0.09344 )
					if( tema <= 0.095083 )
						if( ema2 <= 0.09665 )
							if( bearPower <= -0.001172 )
								if( ema12 <= -0.000532 )
									ret := -0.040000
								if( ema12 > -0.000532 )
									ret := 0.740741 // buy
							if( bearPower > -0.001172 )
								if( ema13 <= 0.003199 )
									ret := -0.274725
								if( ema13 > 0.003199 )
									ret := 1.000000 // buy
						if( ema2 > 0.09665 )
							if( ema2 <= 0.096778 )
								ret := -0.666667
							if( ema2 > 0.096778 )
								if( bbp <= -0.004159 )
									ret := -0.750000 // sell
								if( bbp > -0.004159 )
									ret := -1.000000 // sell
					if( tema > 0.095083 )
						if( ema2 <= 0.096239 )
							if( tema <= 0.096641 )
								if( ema2 <= 0.095578 )
									ret := 0.177966
								if( ema2 > 0.095578 )
									ret := 0.646552
							if( tema > 0.096641 )
								if( bbp <= 0.001229 )
									ret := -0.800000 // sell
								if( bbp > 0.001229 )
									ret := -0.061224
						if( ema2 > 0.096239 )
							if( ema3 <= 0.098024 )
								if( ema3 <= 0.097375 )
									ret := -0.042471
								if( ema3 > 0.097375 )
									ret := -0.532609
							if( ema3 > 0.098024 )
								if( ema12 <= 0.000226 )
									ret := 0.016140
								if( ema12 > 0.000226 )
									ret := 0.112451
			if( bbm > 0.00203 )
				if( ema13 <= 0.009542 )
					if( ema2 <= 0.308752 )
						if( tema <= 0.153619 )
							if( ema12 <= 0.002147 )
								if( ema13 <= 0.0006 )
									ret := 0.273267
								if( ema13 > 0.0006 )
									ret := 0.540881
							if( ema12 > 0.002147 )
								if( ema3 <= 0.13757 )
									ret := -0.918919 // sell
								if( ema3 > 0.13757 )
									ret := 0.500000
						if( tema > 0.153619 )
							if( ema3 <= 0.308853 )
								if( ema12 <= -0.001447 )
									ret := 0.372796
								if( ema12 > -0.001447 )
									ret := 0.117935
							if( ema3 > 0.308853 )
								if( bullPower <= -0.001925 )
									ret := 0.363636
								if( bullPower > -0.001925 )
									ret := -0.810811 // sell
					if( ema2 > 0.308752 )
						if( bbm <= 0.012697 )
							if( ema3 <= 0.310572 )
								if( tema <= 0.314716 )
									ret := 0.555556
								if( tema > 0.314716 )
									ret := 0.897959 // buy
							if( ema3 > 0.310572 )
								if( tema <= 0.320218 )
									ret := 0.455696
								if( tema > 0.320218 )
									ret := -0.200000
						if( bbm > 0.012697 )
							ret := -1.000000 // sell
				if( ema13 > 0.009542 )
					if( bearPower <= 0.006671 )
						if( ema2 <= 0.3208 )
							if( tema <= 0.305641 )
								if( ema2 <= 0.29216 )
									ret := -0.566038
								if( ema2 > 0.29216 )
									ret := 0.750000 // buy
							if( tema > 0.305641 )
								if( ema1 <= 0.315205 )
									ret := -1.000000 // sell
								if( ema1 > 0.315205 )
									ret := -0.600000
						if( ema2 > 0.3208 )
							ret := 0.750000 // buy
					if( bearPower > 0.006671 )
						if( ema13 <= 0.016889 )
							if( ema2 <= 0.266748 )
								if( bbp <= 0.023898 )
									ret := -0.857143 // sell
								if( bbp > 0.023898 )
									ret := -0.250000
							if( ema2 > 0.266748 )
								if( bbm <= 0.00844 )
									ret := 0.181818
								if( bbm > 0.00844 )
									ret := 0.962963 // buy
						if( ema13 > 0.016889 )
							if( ema2 <= 0.303632 )
								ret := -1.000000 // sell
							if( ema2 > 0.303632 )
								if( ema1 <= 0.326717 )
									ret := 0.428571
								if( ema1 > 0.326717 )
									ret := -0.500000
		if( ema3 > 0.313875 )
			if( bearPower <= -0.030048 )
				if( tema <= 1.36312 )
					if( ema3 <= 1.2503 )
						if( bearPower <= -0.044413 )
							if( ema12 <= -0.01914 )
								if( bbm <= 0.055101 )
									ret := 0.200000
								if( bbm > 0.055101 )
									ret := 0.875000 // buy
							if( ema12 > -0.01914 )
								if( ema13 <= -0.010908 )
									ret := -0.807692 // sell
								if( ema13 > -0.010908 )
									ret := 0.055556
						if( bearPower > -0.044413 )
							if( ema12 <= -0.000976 )
								if( bbm <= 0.032621 )
									ret := -0.227273
								if( bbm > 0.032621 )
									ret := 0.480519
							if( ema12 > -0.000976 )
								if( ema2 <= 1.14428 )
									ret := 0.647059
								if( ema2 > 1.14428 )
									ret := 1.000000 // buy
					if( ema3 > 1.2503 )
						if( bearPower <= -0.035434 )
							if( ema3 <= 1.26192 )
								ret := -0.400000
							if( ema3 > 1.26192 )
								if( bbp <= -0.049182 )
									ret := -0.750000 // sell
								if( bbp > -0.049182 )
									ret := -1.000000 // sell
						if( bearPower > -0.035434 )
							if( ema3 <= 1.36715 )
								if( ema2 <= 1.26782 )
									ret := -0.666667
								if( ema2 > 1.26782 )
									ret := 0.214286
							if( ema3 > 1.36715 )
								ret := 1.000000 // buy
				if( tema > 1.36312 )
					if( tema <= 1.63844 )
						if( ema3 <= 1.51117 )
							if( bullPower <= -0.000703 )
								if( ema1 <= 1.45298 )
									ret := -0.500000
								if( ema1 > 1.45298 )
									ret := -1.000000 // sell
							if( bullPower > -0.000703 )
								if( bullPower <= 0.004954 )
									ret := 0.166667
								if( bullPower > 0.004954 )
									ret := 0.846154 // buy
						if( ema3 > 1.51117 )
							if( ema12 <= -0.001212 )
								if( bullPower <= 0.02232 )
									ret := 0.849462 // buy
								if( bullPower > 0.02232 )
									ret := 0.166667
							if( ema12 > -0.001212 )
								ret := -0.800000 // sell
					if( tema > 1.63844 )
						if( ema2 <= 1.68213 )
							if( tema <= 1.66437 )
								ret := -1.000000 // sell
							if( tema > 1.66437 )
								ret := -0.500000
						if( ema2 > 1.68213 )
							if( bullPower <= 0.00269 )
								if( ema2 <= 2.20659 )
									ret := -0.134146
								if( ema2 > 2.20659 )
									ret := 0.258427
							if( bullPower > 0.00269 )
								if( ema2 <= 2.43989 )
									ret := 0.480000
								if( ema2 > 2.43989 )
									ret := 0.107527
			if( bearPower > -0.030048 )
				if( ema2 <= 2.2301 )
					if( ema3 <= 0.318138 )
						if( ema12 <= -0.00028 )
							if( ema2 <= 0.317131 )
								if( ema13 <= -0.002895 )
									ret := -0.327586
								if( ema13 > -0.002895 )
									ret := 0.197044
							if( ema2 > 0.317131 )
								if( ema13 <= -0.000428 )
									ret := -0.692308
								if( ema13 > -0.000428 )
									ret := -0.250000
						if( ema12 > -0.00028 )
							if( ema2 <= 0.325738 )
								if( bbp <= -0.002443 )
									ret := 0.538462
								if( bbp > -0.002443 )
									ret := -0.280534
							if( ema2 > 0.325738 )
								ret := 1.000000 // buy
					if( ema3 > 0.318138 )
						if( bearPower <= 0.039746 )
							if( ema13 <= 0.016484 )
								if( ema1 <= 1.33603 )
									ret := 0.024953
								if( ema1 > 1.33603 )
									ret := -0.040696
							if( ema13 > 0.016484 )
								if( bearPower <= 0.007097 )
									ret := 0.213740
								if( bearPower > 0.007097 )
									ret := 0.032647
						if( bearPower > 0.039746 )
							if( tema <= 2.19323 )
								if( tema <= 1.3534 )
									ret := -0.719298 // sell
								if( tema > 1.3534 )
									ret := -0.282353
							if( tema > 2.19323 )
								if( ema12 <= 0.043532 )
									ret := 0.000000
								if( ema12 > 0.043532 )
									ret := 1.000000 // buy
				if( ema2 > 2.2301 )
					if( ema2 <= 2.37875 )
						if( ema2 <= 2.36542 )
							if( bearPower <= 0.004054 )
								if( ema1 <= 2.34852 )
									ret := -0.139159
								if( ema1 > 2.34852 )
									ret := 0.276596
							if( bearPower > 0.004054 )
								if( ema13 <= 0.088557 )
									ret := -0.516340
								if( ema13 > 0.088557 )
									ret := 0.500000
						if( ema2 > 2.36542 )
							if( ema3 <= 2.3712 )
								if( bearPower <= 0.007017 )
									ret := -1.000000 // sell
								if( bearPower > 0.007017 )
									ret := -0.600000
							if( ema3 > 2.3712 )
								if( ema3 <= 2.38201 )
									ret := 0.166667
								if( ema3 > 2.38201 )
									ret := -0.833333 // sell
					if( ema2 > 2.37875 )
						if( bearPower <= -0.00498 )
							if( ema13 <= 0.039755 )
								if( bearPower <= -0.012082 )
									ret := -0.093976
								if( bearPower > -0.012082 )
									ret := -0.346667
							if( ema13 > 0.039755 )
								if( tema <= 2.58927 )
									ret := 1.000000 // buy
								if( tema > 2.58927 )
									ret := 0.250000
						if( bearPower > -0.00498 )
							if( ema2 <= 2.88625 )
								if( ema12 <= 0.015134 )
									ret := 0.307453
								if( ema12 > 0.015134 )
									ret := -0.013793
							if( ema2 > 2.88625 )
								if( bearPower <= -0.001923 )
									ret := 0.000000
								if( bearPower > -0.001923 )
									ret := -0.564103
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_ADAUSDT_30Min_efbe11d8(bullPower, bbp, bearPower, bbm, BBPower_Color, ema3, tema, ema2, ema12, ema13, ema1)

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


