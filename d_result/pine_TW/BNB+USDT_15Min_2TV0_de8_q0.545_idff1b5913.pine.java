//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: BNBUSDT_15Min_2TV0_ff1b5913 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BNBUSDT_15Min_2TV0_ff1b5913", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BNBUSDT_15Min_ff1b5913(ema3, tema, ema2, ema12, ema13, ema1, VIP, VIM, VIP_VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema13 <= -1.8617 )
		if( ema3 <= 575.991 )
			if( VIP_VIM <= -0.521594 )
				if( ema1 <= 532.644 )
					if( ema3 <= 388.281 )
						if( ema13 <= -5.37444 )
							if( ema1 <= 243.984 )
								if( ema12 <= -4.49878 )
									ret := 1.000000 // buy
								if( ema12 > -4.49878 )
									ret := 0.735849 // buy
							if( ema1 > 243.984 )
								if( tema <= 278.383 )
									ret := 0.000000
								if( tema > 278.383 )
									ret := 0.565359
						if( ema13 > -5.37444 )
							if( ema1 <= 348.825 )
								if( ema3 <= 284.9 )
									ret := 0.344512
								if( ema3 > 284.9 )
									ret := 0.106684
							if( ema1 > 348.825 )
								if( ema2 <= 357.566 )
									ret := 1.000000 // buy
								if( ema2 > 357.566 )
									ret := 0.545455
					if( ema3 > 388.281 )
						if( ema3 <= 408.761 )
							if( ema3 <= 402.165 )
								if( ema13 <= -6.86348 )
									ret := -0.933333 // sell
								if( ema13 > -6.86348 )
									ret := 0.545455
							if( ema3 > 402.165 )
								if( ema3 <= 403.445 )
									ret := -0.888889 // sell
								if( ema3 > 403.445 )
									ret := -1.000000 // sell
						if( ema3 > 408.761 )
							if( ema3 <= 515.163 )
								if( VIM <= 1.26216 )
									ret := -0.333333
								if( VIM > 1.26216 )
									ret := 0.616438
							if( ema3 > 515.163 )
								if( tema <= 510.584 )
									ret := -0.581395
								if( tema > 510.584 )
									ret := 0.185185
				if( ema1 > 532.644 )
					if( ema13 <= -8.85298 )
						if( ema1 <= 556.638 )
							if( tema <= 544.109 )
								ret := 1.000000 // buy
							if( tema > 544.109 )
								if( ema2 <= 559.522 )
									ret := 0.750000 // buy
								if( ema2 > 559.522 )
									ret := 1.000000 // buy
						if( ema1 > 556.638 )
							if( ema2 <= 568.4 )
								ret := -0.428571
							if( ema2 > 568.4 )
								if( ema12 <= -5.73613 )
									ret := 1.000000 // buy
								if( ema12 > -5.73613 )
									ret := 0.500000
					if( ema13 > -8.85298 )
						if( ema3 <= 573.123 )
							if( VIP <= 0.711392 )
								if( VIM <= 1.28974 )
									ret := 0.727273 // buy
								if( VIM > 1.28974 )
									ret := 0.411765
							if( VIP > 0.711392 )
								if( ema1 <= 540.562 )
									ret := -0.916667 // sell
								if( ema1 > 540.562 )
									ret := 0.434783
						if( ema3 > 573.123 )
							if( VIM <= 1.23634 )
								ret := 1.000000 // buy
							if( VIM > 1.23634 )
								if( ema13 <= -6.21176 )
									ret := -0.933333 // sell
								if( ema13 > -6.21176 )
									ret := 0.200000
			if( VIP_VIM > -0.521594 )
				if( ema1 <= 569.293 )
					if( ema3 <= 201.641 )
						if( ema2 <= 195.625 )
							ret := 1.000000 // buy
						if( ema2 > 195.625 )
							ret := -1.000000 // sell
					if( ema3 > 201.641 )
						if( tema <= 219.321 )
							if( VIP <= 0.758886 )
								if( tema <= 206.823 )
									ret := 0.538462
								if( tema > 206.823 )
									ret := -0.357143
							if( VIP > 0.758886 )
								if( ema3 <= 215.7 )
									ret := 0.312500
								if( ema3 > 215.7 )
									ret := 0.781513 // buy
						if( tema > 219.321 )
							if( ema1 <= 227.77 )
								if( ema2 <= 227.746 )
									ret := 0.056000
								if( ema2 > 227.746 )
									ret := -0.886364 // sell
							if( ema1 > 227.77 )
								if( tema <= 518.485 )
									ret := 0.174616
								if( tema > 518.485 )
									ret := 0.062030
				if( ema1 > 569.293 )
					if( ema12 <= -1.60454 )
						if( ema3 <= 573.859 )
							if( ema12 <= -1.68257 )
								ret := 1.000000 // buy
							if( ema12 > -1.68257 )
								ret := 0.750000 // buy
						if( ema3 > 573.859 )
							if( VIM <= 1.16665 )
								if( VIP_VIM <= -0.255766 )
									ret := 1.000000 // buy
								if( VIP_VIM > -0.255766 )
									ret := 0.666667
							if( VIM > 1.16665 )
								if( ema13 <= -3.34783 )
									ret := -0.052632
								if( ema13 > -3.34783 )
									ret := 0.636364
					if( ema12 > -1.60454 )
						if( VIM <= 1.12585 )
							if( ema2 <= 570.669 )
								ret := 1.000000 // buy
							if( ema2 > 570.669 )
								if( ema2 <= 572.846 )
									ret := -0.769231 // sell
								if( ema2 > 572.846 )
									ret := 0.000000
						if( VIM > 1.12585 )
							if( tema <= 569.083 )
								if( VIM <= 1.16526 )
									ret := 1.000000 // buy
								if( VIM > 1.16526 )
									ret := 0.625000
							if( tema > 569.083 )
								if( ema1 <= 571.512 )
									ret := -0.133333
								if( ema1 > 571.512 )
									ret := 0.533333
		if( ema3 > 575.991 )
			if( ema12 <= -5.05563 )
				if( VIP_VIM <= -0.486568 )
					if( ema13 <= -12.0666 )
						if( VIP_VIM <= -0.688047 )
							if( ema13 <= -16.9626 )
								ret := 0.600000
							if( ema13 > -16.9626 )
								if( ema1 <= 639.57 )
									ret := 1.000000 // buy
								if( ema1 > 639.57 )
									ret := 0.750000 // buy
						if( VIP_VIM > -0.688047 )
							if( ema12 <= -7.89747 )
								ret := -0.714286 // sell
							if( ema12 > -7.89747 )
								ret := 1.000000 // buy
					if( ema13 > -12.0666 )
						if( ema2 <= 582.049 )
							if( ema13 <= -10.4151 )
								ret := -1.000000 // sell
							if( ema13 > -10.4151 )
								ret := -0.250000
						if( ema2 > 582.049 )
							if( VIP_VIM <= -0.832271 )
								ret := -0.857143 // sell
							if( VIP_VIM > -0.832271 )
								if( VIP_VIM <= -0.531038 )
									ret := 0.592593
								if( VIP_VIM > -0.531038 )
									ret := -0.333333
				if( VIP_VIM > -0.486568 )
					if( VIM <= 1.16822 )
						ret := 1.000000 // buy
					if( VIM > 1.16822 )
						if( VIP <= 0.78349 )
							if( VIM <= 1.20288 )
								ret := 0.600000
							if( VIM > 1.20288 )
								ret := 1.000000 // buy
						if( VIP > 0.78349 )
							if( VIM <= 1.20054 )
								ret := 0.500000
							if( VIM > 1.20054 )
								ret := 0.000000
			if( ema12 > -5.05563 )
				if( tema <= 574.204 )
					if( VIP <= 0.850542 )
						if( tema <= 564.536 )
							ret := 0.400000
						if( tema > 564.536 )
							if( ema1 <= 571.336 )
								if( VIP_VIM <= -0.602009 )
									ret := 0.250000
								if( VIP_VIM > -0.602009 )
									ret := -0.950000 // sell
							if( ema1 > 571.336 )
								if( tema <= 567.108 )
									ret := 0.500000
								if( tema > 567.108 )
									ret := -0.512987
					if( VIP > 0.850542 )
						if( ema1 <= 574.37 )
							if( VIP_VIM <= -0.252292 )
								ret := 1.000000 // buy
							if( VIP_VIM > -0.252292 )
								if( ema2 <= 574.92 )
									ret := 1.000000 // buy
								if( ema2 > 574.92 )
									ret := 0.000000
						if( ema1 > 574.37 )
							if( ema13 <= -2.39955 )
								ret := -0.400000
							if( ema13 > -2.39955 )
								ret := -1.000000 // sell
				if( tema > 574.204 )
					if( ema3 <= 586.737 )
						if( ema12 <= -0.65126 )
							if( ema2 <= 580.454 )
								if( ema12 <= -0.772675 )
									ret := 0.198953
								if( ema12 > -0.772675 )
									ret := 1.000000 // buy
							if( ema2 > 580.454 )
								if( ema12 <= -0.908122 )
									ret := 0.497854
								if( ema12 > -0.908122 )
									ret := -0.153846
						if( ema12 > -0.65126 )
							if( VIP <= 1.02387 )
								if( tema <= 582.021 )
									ret := -0.555556
								if( tema > 582.021 )
									ret := 1.000000 // buy
							if( VIP > 1.02387 )
								ret := -1.000000 // sell
					if( ema3 > 586.737 )
						if( VIM <= 1.246 )
							if( ema12 <= -0.846389 )
								if( ema2 <= 703.155 )
									ret := 0.031889
								if( ema2 > 703.155 )
									ret := 0.800000 // buy
							if( ema12 > -0.846389 )
								if( VIP <= 0.953224 )
									ret := -0.196078
								if( VIP > 0.953224 )
									ret := -0.714286 // sell
						if( VIM > 1.246 )
							if( tema <= 586.334 )
								if( ema2 <= 588.115 )
									ret := -0.296296
								if( ema2 > 588.115 )
									ret := -0.782609 // sell
							if( tema > 586.334 )
								if( tema <= 597.978 )
									ret := 0.171875
								if( tema > 597.978 )
									ret := -0.457364
	if( ema13 > -1.8617 )
		if( ema12 <= -0.655675 )
			if( ema3 <= 571.485 )
				if( VIP_VIM <= -0.430093 )
					if( ema13 <= -1.37986 )
						if( VIM <= 1.1281 )
							if( tema <= 271.518 )
								ret := -1.000000 // sell
							if( tema > 271.518 )
								ret := -0.500000
						if( VIM > 1.1281 )
							if( tema <= 328.675 )
								if( VIP_VIM <= -0.435919 )
									ret := 0.157973
								if( VIP_VIM > -0.435919 )
									ret := -0.178571
							if( tema > 328.675 )
								if( ema3 <= 335.329 )
									ret := -1.000000 // sell
								if( ema3 > 335.329 )
									ret := 0.142857
					if( ema13 > -1.37986 )
						if( VIM <= 1.21921 )
							if( ema2 <= 248.193 )
								if( tema <= 242.857 )
									ret := 0.222222
								if( tema > 242.857 )
									ret := 1.000000 // buy
							if( ema2 > 248.193 )
								if( ema2 <= 271.541 )
									ret := -0.687500
								if( ema2 > 271.541 )
									ret := 0.068182
						if( VIM > 1.21921 )
							if( ema2 <= 318.088 )
								if( ema12 <= -0.885885 )
									ret := 0.354839
								if( ema12 > -0.885885 )
									ret := -0.261261
							if( ema2 > 318.088 )
								if( VIP <= 0.677818 )
									ret := 0.333333
								if( VIP > 0.677818 )
									ret := -0.576271
				if( VIP_VIM > -0.430093 )
					if( ema2 <= 219.713 )
						if( ema13 <= -1.63621 )
							if( VIP_VIM <= -0.257702 )
								if( ema2 <= 211.428 )
									ret := 0.125000
								if( ema2 > 211.428 )
									ret := -0.526316
							if( VIP_VIM > -0.257702 )
								if( ema13 <= -1.70992 )
									ret := 1.000000 // buy
								if( ema13 > -1.70992 )
									ret := 0.000000
						if( ema13 > -1.63621 )
							if( tema <= 212.618 )
								if( ema3 <= 212.902 )
									ret := 0.590909
								if( ema3 > 212.902 )
									ret := -0.727273 // sell
							if( tema > 212.618 )
								if( ema12 <= -0.702215 )
									ret := 0.841270 // buy
								if( ema12 > -0.702215 )
									ret := 0.440000
					if( ema2 > 219.713 )
						if( tema <= 223.7 )
							if( VIP_VIM <= -0.303236 )
								if( VIM <= 1.15403 )
									ret := 0.000000
								if( VIM > 1.15403 )
									ret := -0.800000 // sell
							if( VIP_VIM > -0.303236 )
								if( ema2 <= 224.812 )
									ret := 0.250000
								if( ema2 > 224.812 )
									ret := -0.750000 // sell
						if( tema > 223.7 )
							if( tema <= 224.864 )
								if( tema <= 223.792 )
									ret := 0.500000
								if( tema > 223.792 )
									ret := 0.965517 // buy
							if( tema > 224.864 )
								if( ema13 <= -1.73245 )
									ret := 0.037433
								if( ema13 > -1.73245 )
									ret := 0.204950
			if( ema3 > 571.485 )
				if( ema2 <= 583.662 )
					if( ema13 <= -1.59504 )
						if( VIM <= 1.16406 )
							if( ema13 <= -1.63185 )
								if( ema12 <= -0.769663 )
									ret := -0.384615
								if( ema12 > -0.769663 )
									ret := 0.416667
							if( ema13 > -1.63185 )
								ret := 0.400000
						if( VIM > 1.16406 )
							if( tema <= 577.339 )
								if( tema <= 573.254 )
									ret := 0.882353 // buy
								if( tema > 573.254 )
									ret := 0.416667
							if( tema > 577.339 )
								if( ema2 <= 581.579 )
									ret := -0.166667
								if( ema2 > 581.579 )
									ret := -1.000000 // sell
					if( ema13 > -1.59504 )
						if( ema2 <= 580.925 )
							if( tema <= 578.543 )
								if( ema1 <= 579.636 )
									ret := -0.419162
								if( ema1 > 579.636 )
									ret := 0.666667
							if( tema > 578.543 )
								if( ema3 <= 581.409 )
									ret := -0.920000 // sell
								if( ema3 > 581.409 )
									ret := -0.250000
						if( ema2 > 580.925 )
							if( tema <= 579.303 )
								if( VIM <= 1.19798 )
									ret := 0.642857
								if( VIM > 1.19798 )
									ret := 0.000000
							if( tema > 579.303 )
								if( ema3 <= 583.203 )
									ret := -0.619048
								if( ema3 > 583.203 )
									ret := -0.071429
				if( ema2 > 583.662 )
					if( ema3 <= 586.185 )
						if( ema12 <= -1.19243 )
							if( VIP_VIM <= -0.352449 )
								ret := 0.750000 // buy
							if( VIP_VIM > -0.352449 )
								ret := 1.000000 // buy
						if( ema12 > -1.19243 )
							if( ema13 <= -1.43961 )
								if( tema <= 581.464 )
									ret := 0.750000 // buy
								if( tema > 581.464 )
									ret := -0.074074
							if( ema13 > -1.43961 )
								if( VIP_VIM <= -0.095685 )
									ret := 0.611111
								if( VIP_VIM > -0.095685 )
									ret := -0.400000
					if( ema3 > 586.185 )
						if( VIP_VIM <= -0.107087 )
							if( ema12 <= -1.19609 )
								if( VIP_VIM <= -0.341016 )
									ret := -0.727273 // sell
								if( VIP_VIM > -0.341016 )
									ret := -0.333333
							if( ema12 > -1.19609 )
								if( ema12 <= -1.18968 )
									ret := 1.000000 // buy
								if( ema12 > -1.18968 )
									ret := -0.032819
						if( VIP_VIM > -0.107087 )
							if( VIP <= 1.0019 )
								if( ema2 <= 630.439 )
									ret := 0.513514
								if( ema2 > 630.439 )
									ret := -0.285714
							if( VIP > 1.0019 )
								if( ema1 <= 621.316 )
									ret := -0.250000
								if( ema1 > 621.316 )
									ret := 0.750000 // buy
		if( ema12 > -0.655675 )
			if( tema <= 582.061 )
				if( ema3 <= 382.091 )
					if( ema1 <= 327.57 )
						if( VIP_VIM <= 0.601992 )
							if( tema <= 313.921 )
								if( ema12 <= 0.450301 )
									ret := 0.043365
								if( ema12 > 0.450301 )
									ret := -0.002703
							if( tema > 313.921 )
								if( VIM <= 0.73912 )
									ret := 0.194888
								if( VIM > 0.73912 )
									ret := -0.036663
						if( VIP_VIM > 0.601992 )
							if( ema1 <= 316.597 )
								if( ema3 <= 229.226 )
									ret := -0.126506
								if( ema3 > 229.226 )
									ret := 0.172521
							if( ema1 > 316.597 )
								if( ema12 <= 1.60484 )
									ret := 0.712121 // buy
								if( ema12 > 1.60484 )
									ret := 0.251969
					if( ema1 > 327.57 )
						if( ema12 <= 1.71005 )
							if( ema13 <= 0.194599 )
								if( VIM <= 0.984221 )
									ret := 0.267409
								if( VIM > 0.984221 )
									ret := -0.045029
							if( ema13 > 0.194599 )
								if( ema13 <= 1.69865 )
									ret := -0.167209
								if( ema13 > 1.69865 )
									ret := 0.074313
						if( ema12 > 1.71005 )
							if( ema13 <= 5.97078 )
								if( VIP_VIM <= 0.721351 )
									ret := -0.473498
								if( VIP_VIM > 0.721351 )
									ret := 0.074074
							if( ema13 > 5.97078 )
								if( ema1 <= 331.517 )
									ret := -0.400000
								if( ema1 > 331.517 )
									ret := -1.000000 // sell
				if( ema3 > 382.091 )
					if( ema13 <= 7.25041 )
						if( ema1 <= 500.511 )
							if( ema3 <= 427.521 )
								if( ema3 <= 397.255 )
									ret := 0.243931
								if( ema3 > 397.255 )
									ret := -0.049251
							if( ema3 > 427.521 )
								if( ema2 <= 481.583 )
									ret := 0.510297
								if( ema2 > 481.583 )
									ret := 0.206349
						if( ema1 > 500.511 )
							if( ema13 <= 0.552879 )
								if( tema <= 555.671 )
									ret := 0.084226
								if( tema > 555.671 )
									ret := -0.065801
							if( ema13 > 0.552879 )
								if( ema3 <= 552.973 )
									ret := 0.039807
								if( ema3 > 552.973 )
									ret := 0.211037
					if( ema13 > 7.25041 )
						if( ema12 <= 6.84085 )
							if( VIM <= 0.669935 )
								if( ema12 <= 5.04839 )
									ret := -0.352941
								if( ema12 > 5.04839 )
									ret := 0.315789
							if( VIM > 0.669935 )
								if( ema13 <= 8.65285 )
									ret := -0.274510
								if( ema13 > 8.65285 )
									ret := -0.845070 // sell
						if( ema12 > 6.84085 )
							if( VIM <= 0.655886 )
								if( ema12 <= 8.97555 )
									ret := 1.000000 // buy
								if( ema12 > 8.97555 )
									ret := 0.000000
							if( VIM > 0.655886 )
								if( VIP <= 1.25784 )
									ret := 0.888889 // buy
								if( VIP > 1.25784 )
									ret := -0.750000 // sell
			if( tema > 582.061 )
				if( ema2 <= 624.384 )
					if( ema1 <= 616.044 )
						if( tema <= 612.356 )
							if( ema3 <= 607.951 )
								if( ema1 <= 607.088 )
									ret := -0.046151
								if( ema1 > 607.088 )
									ret := 0.329787
							if( ema3 > 607.951 )
								if( tema <= 608.401 )
									ret := -0.170213
								if( tema > 608.401 )
									ret := -0.687805
						if( tema > 612.356 )
							if( tema <= 614.146 )
								if( ema13 <= -0.530837 )
									ret := -0.375000
								if( ema13 > -0.530837 )
									ret := 0.622642
							if( tema > 614.146 )
								if( ema3 <= 598.831 )
									ret := 0.857143 // buy
								if( ema3 > 598.831 )
									ret := -0.024540
					if( ema1 > 616.044 )
						if( ema3 <= 621.748 )
							if( ema12 <= 0.125746 )
								if( VIM <= 0.995571 )
									ret := -0.600000
								if( VIM > 0.995571 )
									ret := 0.625000
							if( ema12 > 0.125746 )
								if( ema1 <= 620.161 )
									ret := -0.662069
								if( ema1 > 620.161 )
									ret := -0.174603
						if( ema3 > 621.748 )
							if( ema13 <= -1.05693 )
								ret := 0.000000
							if( ema13 > -1.05693 )
								if( VIM <= 0.981496 )
									ret := -1.000000 // sell
								if( VIM > 0.981496 )
									ret := -0.857143 // sell
				if( ema2 > 624.384 )
					if( tema <= 705.919 )
						if( VIP_VIM <= 0.315598 )
							if( ema1 <= 703.405 )
								if( ema2 <= 647.738 )
									ret := 0.310345
								if( ema2 > 647.738 )
									ret := 0.003344
							if( ema1 > 703.405 )
								if( VIP_VIM <= 0.081278 )
									ret := 0.818182 // buy
								if( VIP_VIM > 0.081278 )
									ret := -0.200000
						if( VIP_VIM > 0.315598 )
							if( VIP_VIM <= 0.571295 )
								if( ema13 <= 2.81693 )
									ret := 0.333333
								if( ema13 > 2.81693 )
									ret := 0.802198 // buy
							if( VIP_VIM > 0.571295 )
								if( tema <= 697.59 )
									ret := 0.137931
								if( tema > 697.59 )
									ret := -1.000000 // sell
					if( tema > 705.919 )
						if( VIP <= 1.05297 )
							if( ema3 <= 706.625 )
								if( VIP <= 1.02209 )
									ret := -0.333333
								if( VIP > 1.02209 )
									ret := 0.764706 // buy
							if( ema3 > 706.625 )
								if( ema13 <= 0.89639 )
									ret := -0.250000
								if( ema13 > 0.89639 )
									ret := -0.833333 // sell
						if( VIP > 1.05297 )
							if( ema3 <= 702.728 )
								if( ema12 <= 5.19558 )
									ret := -0.090909
								if( ema12 > 5.19558 )
									ret := -1.000000 // sell
							if( ema3 > 702.728 )
								if( ema13 <= 0.539384 )
									ret := 0.000000
								if( ema13 > 0.539384 )
									ret := -0.849057 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

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
float op_operation = decision_tree_0_BNBUSDT_15Min_ff1b5913(ema3, tema, ema2, ema12, ema13, ema1, VIP, VIM, VIP_VIM)

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


