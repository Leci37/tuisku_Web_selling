//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: VETUSDT_15Min_2BT0_cdbfe9af Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_VETUSDT_15Min_2BT0_cdbfe9af", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_VETUSDT_15Min_cdbfe9af(bbp, bullPower, BBPower_Color, bearPower, bbm, ema2, tema, ema12, ema3, ema1, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( bbp <= -0.00018 )
		if( tema <= 0.022551 )
			if( ema13 <= -0.000205 )
				if( bullPower <= -7.9e-05 )
					if( ema12 <= -0.000428 )
						if( ema1 <= 0.022233 )
							if( bearPower <= -0.000933 )
								if( ema12 <= -0.000557 )
									ret := -0.066667
								if( ema12 > -0.000557 )
									ret := 0.883721 // buy
							if( bearPower > -0.000933 )
								if( bbm <= 0.000243 )
									ret := 0.842105 // buy
								if( bbm > 0.000243 )
									ret := 0.976190 // buy
						if( ema1 > 0.022233 )
							ret := -0.066667
					if( ema12 > -0.000428 )
						if( tema <= 0.022381 )
							if( ema1 <= 0.022419 )
								if( bullPower <= -0.000239 )
									ret := 0.519048
								if( bullPower > -0.000239 )
									ret := 0.274978
							if( ema1 > 0.022419 )
								if( bearPower <= -0.000274 )
									ret := -0.176000
								if( bearPower > -0.000274 )
									ret := 0.666667
						if( tema > 0.022381 )
							if( ema2 <= 0.022787 )
								if( bbp <= -0.000472 )
									ret := 0.888889 // buy
								if( bbp > -0.000472 )
									ret := 1.000000 // buy
							if( ema2 > 0.022787 )
								if( bbp <= -0.00067 )
									ret := 0.818182 // buy
								if( bbp > -0.00067 )
									ret := 0.456522
				if( bullPower > -7.9e-05 )
					if( ema2 <= 0.020484 )
						if( ema2 <= 0.019954 )
							if( ema2 <= 0.019139 )
								if( bbp <= -0.000293 )
									ret := -0.560000
								if( bbp > -0.000293 )
									ret := 0.677419
							if( ema2 > 0.019139 )
								if( ema12 <= -0.000179 )
									ret := 1.000000 // buy
								if( ema12 > -0.000179 )
									ret := 0.444444
						if( ema2 > 0.019954 )
							if( ema2 <= 0.020019 )
								ret := -0.692308
							if( ema2 > 0.020019 )
								if( ema13 <= -0.000265 )
									ret := -1.000000 // sell
								if( ema13 > -0.000265 )
									ret := -0.906250 // sell
					if( ema2 > 0.020484 )
						if( bearPower <= -0.000515 )
							if( bearPower <= -0.000642 )
								ret := -0.400000
							if( bearPower > -0.000642 )
								ret := -1.000000 // sell
						if( bearPower > -0.000515 )
							if( ema1 <= 0.022504 )
								if( tema <= 0.022277 )
									ret := 0.345622
								if( tema > 0.022277 )
									ret := -0.952381 // sell
							if( ema1 > 0.022504 )
								if( ema13 <= -0.000389 )
									ret := 0.700000 // buy
								if( ema13 > -0.000389 )
									ret := 0.921053 // buy
			if( ema13 > -0.000205 )
				if( ema12 <= -0.000131 )
					if( ema3 <= 0.019704 )
						ret := 0.000000
					if( ema3 > 0.019704 )
						if( tema <= 0.020857 )
							if( bbp <= -0.00059 )
								ret := -1.000000 // sell
							if( bbp > -0.00059 )
								ret := -0.818182 // sell
						if( tema > 0.020857 )
							if( ema13 <= -0.00018 )
								ret := -0.480000
							if( ema13 > -0.00018 )
								ret := 0.000000
				if( ema12 > -0.000131 )
					if( tema <= 0.021313 )
						if( ema2 <= 0.01912 )
							if( bullPower <= -0.000123 )
								if( tema <= 0.017481 )
									ret := -0.394737
								if( tema > 0.017481 )
									ret := 0.086957
							if( bullPower > -0.000123 )
								if( ema13 <= -0.000142 )
									ret := 0.439227
								if( ema13 > -0.000142 )
									ret := 0.143816
						if( ema2 > 0.01912 )
							if( bbm <= 0.000797 )
								if( bbm <= 0.00037 )
									ret := -0.020067
								if( bbm > 0.00037 )
									ret := 0.790698 // buy
							if( bbm > 0.000797 )
								ret := -1.000000 // sell
					if( tema > 0.021313 )
						if( ema3 <= 0.022389 )
							if( ema2 <= 0.022286 )
								if( bbm <= 0.00012 )
									ret := 0.064057
								if( bbm > 0.00012 )
									ret := 0.508137
							if( ema2 > 0.022286 )
								if( ema3 <= 0.022353 )
									ret := 0.742857 // buy
								if( ema3 > 0.022353 )
									ret := 0.984615 // buy
						if( ema3 > 0.022389 )
							if( ema1 <= 0.022565 )
								if( bearPower <= -0.000185 )
									ret := -0.337255
								if( bearPower > -0.000185 )
									ret := 0.166667
							if( ema1 > 0.022565 )
								if( ema3 <= 0.022829 )
									ret := 0.250000
								if( ema3 > 0.022829 )
									ret := 0.954545 // buy
		if( tema > 0.022551 )
			if( ema13 <= -0.000277 )
				if( ema3 <= 0.047738 )
					if( tema <= 0.023137 )
						if( bbp <= -0.001356 )
							ret := 0.882353 // buy
						if( bbp > -0.001356 )
							if( bearPower <= -0.000327 )
								if( ema2 <= 0.023213 )
									ret := 0.225000
								if( ema2 > 0.023213 )
									ret := -0.526012
							if( bearPower > -0.000327 )
								if( ema1 <= 0.023088 )
									ret := -0.222222
								if( ema1 > 0.023088 )
									ret := 0.379310
					if( tema > 0.023137 )
						if( ema12 <= -0.001184 )
							if( ema3 <= 0.043732 )
								ret := 1.000000 // buy
							if( ema3 > 0.043732 )
								if( bullPower <= -0.001751 )
									ret := 1.000000 // buy
								if( bullPower > -0.001751 )
									ret := 0.800000 // buy
						if( ema12 > -0.001184 )
							if( ema13 <= -0.001362 )
								if( ema13 <= -0.001478 )
									ret := -0.430000
								if( ema13 > -0.001478 )
									ret := -0.875000 // sell
							if( ema13 > -0.001362 )
								if( bbm <= 0.00126 )
									ret := 0.174153
								if( bbm > 0.00126 )
									ret := 0.734694 // buy
				if( ema3 > 0.047738 )
					if( ema12 <= -0.000484 )
						if( ema13 <= -0.001059 )
							if( bbm <= 0.000749 )
								if( bearPower <= -0.001062 )
									ret := -0.730769 // sell
								if( bearPower > -0.001062 )
									ret := 0.035714
							if( bbm > 0.000749 )
								if( bullPower <= -0.000767 )
									ret := -0.600000
								if( bullPower > -0.000767 )
									ret := 1.000000 // buy
						if( ema13 > -0.001059 )
							if( bbp <= -0.002057 )
								if( ema3 <= 0.048574 )
									ret := 1.000000 // buy
								if( ema3 > 0.048574 )
									ret := -0.052632
							if( bbp > -0.002057 )
								if( bullPower <= -0.000471 )
									ret := 0.878049 // buy
								if( bullPower > -0.000471 )
									ret := 0.681818
					if( ema12 > -0.000484 )
						if( bearPower <= -0.000608 )
							if( bbm <= 0.000521 )
								if( bbm <= 0.000432 )
									ret := 0.185185
								if( bbm > 0.000432 )
									ret := 0.779412 // buy
							if( bbm > 0.000521 )
								if( ema2 <= 0.052002 )
									ret := -0.123894
								if( ema2 > 0.052002 )
									ret := -0.803922 // sell
						if( bearPower > -0.000608 )
							if( ema2 <= 0.051294 )
								if( ema2 <= 0.049185 )
									ret := -0.321782
								if( ema2 > 0.049185 )
									ret := -0.894118 // sell
							if( ema2 > 0.051294 )
								if( ema3 <= 0.053389 )
									ret := 1.000000 // buy
								if( ema3 > 0.053389 )
									ret := -1.000000 // sell
			if( ema13 > -0.000277 )
				if( ema13 <= -0.000123 )
					if( ema3 <= 0.048663 )
						if( ema12 <= -5.6e-05 )
							if( ema1 <= 0.04416 )
								if( ema2 <= 0.042107 )
									ret := -0.000446
								if( ema2 > 0.042107 )
									ret := -0.639053
							if( ema1 > 0.04416 )
								if( tema <= 0.044236 )
									ret := 0.861111 // buy
								if( tema > 0.044236 )
									ret := 0.098214
						if( ema12 > -5.6e-05 )
							if( ema3 <= 0.025858 )
								ret := -1.000000 // sell
							if( ema3 > 0.025858 )
								if( bbp <= -0.000271 )
									ret := -1.000000 // sell
								if( bbp > -0.000271 )
									ret := 0.000000
					if( ema3 > 0.048663 )
						if( ema1 <= 0.048703 )
							if( ema12 <= -0.000135 )
								if( bearPower <= -0.000746 )
									ret := -0.875000 // sell
								if( bearPower > -0.000746 )
									ret := -0.666667
							if( ema12 > -0.000135 )
								ret := -1.000000 // sell
						if( ema1 > 0.048703 )
							if( ema1 <= 0.051837 )
								if( bbp <= -0.000585 )
									ret := 0.326087
								if( bbp > -0.000585 )
									ret := -0.359649
							if( ema1 > 0.051837 )
								ret := -1.000000 // sell
				if( ema13 > -0.000123 )
					if( ema2 <= 0.035767 )
						if( ema3 <= 0.025759 )
							if( ema3 <= 0.025352 )
								if( tema <= 0.02471 )
									ret := 0.149972
								if( tema > 0.02471 )
									ret := -0.234177
							if( ema3 > 0.025352 )
								if( tema <= 0.025506 )
									ret := 0.677273
								if( tema > 0.025506 )
									ret := 0.338028
						if( ema3 > 0.025759 )
							if( ema3 <= 0.030729 )
								if( ema12 <= -0.000106 )
									ret := -0.931034 // sell
								if( ema12 > -0.000106 )
									ret := -0.014006
							if( ema3 > 0.030729 )
								if( tema <= 0.030786 )
									ret := 0.774194 // buy
								if( tema > 0.030786 )
									ret := 0.124234
					if( ema2 > 0.035767 )
						if( tema <= 0.036717 )
							if( ema1 <= 0.036081 )
								if( ema12 <= -2.1e-05 )
									ret := -0.509615
								if( ema12 > -2.1e-05 )
									ret := 0.666667
							if( ema1 > 0.036081 )
								if( bbm <= 0.000184 )
									ret := -0.472727
								if( bbm > 0.000184 )
									ret := -0.912281 // sell
						if( tema > 0.036717 )
							if( ema1 <= 0.039486 )
								if( bbm <= 0.00033 )
									ret := 0.056738
								if( bbm > 0.00033 )
									ret := 0.597561
							if( ema1 > 0.039486 )
								if( bbp <= -0.001257 )
									ret := 0.750000 // buy
								if( bbp > -0.001257 )
									ret := -0.102308
	if( bbp > -0.00018 )
		if( ema1 <= 0.022602 )
			if( ema13 <= 0.000211 )
				if( bbm <= 0.000107 )
					if( ema13 <= 5.6e-05 )
						if( ema1 <= 0.014821 )
							if( ema13 <= -4.7e-05 )
								if( ema13 <= -6.7e-05 )
									ret := 0.181818
								if( ema13 > -6.7e-05 )
									ret := -0.300000
							if( ema13 > -4.7e-05 )
								if( bearPower <= 3.3e-05 )
									ret := 0.491667
								if( bearPower > 3.3e-05 )
									ret := 0.000000
						if( ema1 > 0.014821 )
							if( tema <= 0.016638 )
								if( ema12 <= 1.1e-05 )
									ret := -0.005839
								if( ema12 > 1.1e-05 )
									ret := 0.127522
							if( tema > 0.016638 )
								if( ema2 <= 0.016728 )
									ret := -0.382429
								if( ema2 > 0.016728 )
									ret := -0.032656
					if( ema13 > 5.6e-05 )
						if( bbp <= 0.000245 )
							if( ema2 <= 0.022515 )
								if( bbp <= 0.000216 )
									ret := 0.059310
								if( bbp > 0.000216 )
									ret := 0.233974
							if( ema2 > 0.022515 )
								if( tema <= 0.022578 )
									ret := 0.444444
								if( tema > 0.022578 )
									ret := 0.781250 // buy
						if( bbp > 0.000245 )
							if( ema2 <= 0.018622 )
								if( bbm <= 8.8e-05 )
									ret := 0.258065
								if( bbm > 8.8e-05 )
									ret := -0.093750
							if( ema2 > 0.018622 )
								if( bbm <= 5.6e-05 )
									ret := 0.191489
								if( bbm > 5.6e-05 )
									ret := -0.291667
				if( bbm > 0.000107 )
					if( ema12 <= 0.000115 )
						if( tema <= 0.022385 )
							if( bullPower <= 5.5e-05 )
								if( ema12 <= 3e-05 )
									ret := 0.132143
								if( ema12 > 3e-05 )
									ret := 0.746269 // buy
							if( bullPower > 5.5e-05 )
								if( ema2 <= 0.022165 )
									ret := 0.007637
								if( ema2 > 0.022165 )
									ret := 0.233766
						if( tema > 0.022385 )
							if( ema12 <= -5.2e-05 )
								if( ema12 <= -6.4e-05 )
									ret := -0.058824
								if( ema12 > -6.4e-05 )
									ret := -0.727273 // sell
							if( ema12 > -5.2e-05 )
								if( tema <= 0.022428 )
									ret := 0.653226
								if( tema > 0.022428 )
									ret := 0.285081
					if( ema12 > 0.000115 )
						if( bbp <= 0.000469 )
							if( ema1 <= 0.01959 )
								if( ema1 <= 0.019171 )
									ret := -0.538462
								if( ema1 > 0.019171 )
									ret := -0.897436 // sell
							if( ema1 > 0.01959 )
								if( ema2 <= 0.02241 )
									ret := -0.020000
								if( ema2 > 0.02241 )
									ret := -1.000000 // sell
						if( bbp > 0.000469 )
							if( ema2 <= 0.02227 )
								if( bearPower <= 0.000133 )
									ret := 0.892857 // buy
								if( bearPower > 0.000133 )
									ret := -0.195122
							if( ema2 > 0.02227 )
								ret := -1.000000 // sell
			if( ema13 > 0.000211 )
				if( tema <= 0.020953 )
					if( ema13 <= 0.000459 )
						if( bearPower <= 0.000124 )
							if( bbp <= 0.000411 )
								if( bbm <= 8.1e-05 )
									ret := 0.438596
								if( bbm > 8.1e-05 )
									ret := 0.719603 // buy
							if( bbp > 0.000411 )
								if( ema1 <= 0.020424 )
									ret := -0.037736
								if( ema1 > 0.020424 )
									ret := 1.000000 // buy
						if( bearPower > 0.000124 )
							if( bearPower <= 0.000201 )
								if( tema <= 0.019722 )
									ret := 0.086207
								if( tema > 0.019722 )
									ret := 0.593407
							if( bearPower > 0.000201 )
								if( ema1 <= 0.020103 )
									ret := -0.521127
								if( ema1 > 0.020103 )
									ret := 0.694444
					if( ema13 > 0.000459 )
						if( bbm <= 0.000239 )
							ret := -0.615385
						if( bbm > 0.000239 )
							ret := -1.000000 // sell
				if( tema > 0.020953 )
					if( tema <= 0.021896 )
						if( ema3 <= 0.021053 )
							if( ema1 <= 0.020655 )
								if( bbp <= 0.000981 )
									ret := -0.923077 // sell
								if( bbp > 0.000981 )
									ret := -1.000000 // sell
							if( ema1 > 0.020655 )
								if( ema12 <= 0.000163 )
									ret := -0.538462
								if( ema12 > 0.000163 )
									ret := 0.409449
						if( ema3 > 0.021053 )
							if( ema12 <= 0.000168 )
								if( ema12 <= 0.000118 )
									ret := -0.533333
								if( ema12 > 0.000118 )
									ret := -0.957143 // sell
							if( ema12 > 0.000168 )
								ret := 0.000000
					if( tema > 0.021896 )
						if( ema2 <= 0.021494 )
							if( tema <= 0.02225 )
								if( tema <= 0.022055 )
									ret := 0.789474 // buy
								if( tema > 0.022055 )
									ret := 0.967742 // buy
							if( tema > 0.02225 )
								ret := -0.285714
						if( ema2 > 0.021494 )
							if( ema12 <= 0.000157 )
								if( bearPower <= 0.000147 )
									ret := 0.575758
								if( bearPower > 0.000147 )
									ret := 0.035714
							if( ema12 > 0.000157 )
								if( tema <= 0.022521 )
									ret := -0.338583
								if( tema > 0.022521 )
									ret := 0.053571
		if( ema1 > 0.022602 )
			if( tema <= 0.049346 )
				if( bbp <= 6.1e-05 )
					if( ema2 <= 0.047256 )
						if( bbm <= 0.000118 )
							if( bullPower <= 7.5e-05 )
								if( bbp <= -5e-05 )
									ret := -0.105026
								if( bbp > -5e-05 )
									ret := -0.029600
							if( bullPower > 7.5e-05 )
								if( tema <= 0.02883 )
									ret := 0.303644
								if( tema > 0.02883 )
									ret := -0.377778
						if( bbm > 0.000118 )
							if( tema <= 0.044448 )
								if( ema13 <= -0.000246 )
									ret := -0.159292
								if( ema13 > -0.000246 )
									ret := 0.025761
							if( tema > 0.044448 )
								if( ema2 <= 0.046769 )
									ret := -0.154054
								if( ema2 > 0.046769 )
									ret := -0.732143 // sell
					if( ema2 > 0.047256 )
						if( tema <= 0.048783 )
							if( ema1 <= 0.048423 )
								if( ema1 <= 0.048342 )
									ret := 0.365000
								if( ema1 > 0.048342 )
									ret := -0.454545
							if( ema1 > 0.048423 )
								if( ema12 <= 2.1e-05 )
									ret := 0.813559 // buy
								if( ema12 > 2.1e-05 )
									ret := 0.375000
						if( tema > 0.048783 )
							if( tema <= 0.049152 )
								if( bbp <= -0.000144 )
									ret := -0.809524 // sell
								if( bbp > -0.000144 )
									ret := -0.333333
							if( tema > 0.049152 )
								if( bbp <= -1.9e-05 )
									ret := 0.947368 // buy
								if( bbp > -1.9e-05 )
									ret := 0.307692
				if( bbp > 6.1e-05 )
					if( bearPower <= -3.1e-05 )
						if( bbp <= 0.000907 )
							if( bbm <= 0.00071 )
								if( ema1 <= 0.049005 )
									ret := -0.160166
								if( ema1 > 0.049005 )
									ret := 0.384615
							if( bbm > 0.00071 )
								if( ema3 <= 0.045697 )
									ret := 0.026667
								if( ema3 > 0.045697 )
									ret := 0.666667
						if( bbp > 0.000907 )
							if( ema1 <= 0.030367 )
								ret := -0.230769
							if( ema1 > 0.030367 )
								if( bbm <= 0.001296 )
									ret := -0.800000 // sell
								if( bbm > 0.001296 )
									ret := -1.000000 // sell
					if( bearPower > -3.1e-05 )
						if( ema3 <= 0.027167 )
							if( ema1 <= 0.026593 )
								if( ema12 <= 0.00059 )
									ret := -0.075568
								if( ema12 > 0.00059 )
									ret := -1.000000 // sell
							if( ema1 > 0.026593 )
								if( bullPower <= 0.0002 )
									ret := -0.134146
								if( bullPower > 0.0002 )
									ret := -0.411681
						if( ema3 > 0.027167 )
							if( ema2 <= 0.02754 )
								if( ema13 <= 0.000473 )
									ret := 0.427896
								if( ema13 > 0.000473 )
									ret := -0.909091 // sell
							if( ema2 > 0.02754 )
								if( bullPower <= 0.001385 )
									ret := -0.037570
								if( bullPower > 0.001385 )
									ret := -0.345865
			if( tema > 0.049346 )
				if( ema2 <= 0.048699 )
					if( ema12 <= 0.000462 )
						if( bullPower <= 0.000766 )
							ret := -1.000000 // sell
						if( bullPower > 0.000766 )
							ret := -0.687500
					if( ema12 > 0.000462 )
						ret := -1.000000 // sell
				if( ema2 > 0.048699 )
					if( ema12 <= 0.000107 )
						if( bearPower <= -0.000257 )
							if( bbm <= 0.000622 )
								if( ema2 <= 0.05154 )
									ret := 0.681818
								if( ema2 > 0.05154 )
									ret := -0.428571
							if( bbm > 0.000622 )
								ret := -1.000000 // sell
						if( bearPower > -0.000257 )
							if( tema <= 0.052013 )
								if( ema3 <= 0.051377 )
									ret := -0.689362
								if( ema3 > 0.051377 )
									ret := -0.118421
							if( tema > 0.052013 )
								if( bullPower <= 0.000141 )
									ret := -0.761905 // sell
								if( bullPower > 0.000141 )
									ret := -1.000000 // sell
					if( ema12 > 0.000107 )
						if( ema3 <= 0.050122 )
							if( bullPower <= 0.001591 )
								if( ema13 <= 0.000768 )
									ret := 0.136691
								if( ema13 > 0.000768 )
									ret := -0.981132 // sell
							if( bullPower > 0.001591 )
								if( ema2 <= 0.049276 )
									ret := 0.333333
								if( ema2 > 0.049276 )
									ret := 0.972222 // buy
						if( ema3 > 0.050122 )
							if( tema <= 0.051912 )
								if( ema2 <= 0.050372 )
									ret := -0.583333
								if( ema2 > 0.050372 )
									ret := -1.000000 // sell
							if( tema > 0.051912 )
								if( ema2 <= 0.053809 )
									ret := 0.078947
								if( ema2 > 0.053809 )
									ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_VETUSDT_15Min_cdbfe9af(bbp, bullPower, BBPower_Color, bearPower, bbm, ema2, tema, ema12, ema3, ema1, ema13)

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


