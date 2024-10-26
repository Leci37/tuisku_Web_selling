//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: PTON_15Min_1T00_0e74f75c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PTON_15Min_1T00_0e74f75c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PTON_15Min_0e74f75c(ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema12 <= 0.006539 )
		if( tema <= 4.38825 )
			if( ema3 <= 3.05735 )
				if( ema2 <= 3.02172 )
					if( ema1 <= 2.9851 )
						if( ema12 <= -0.004317 )
							if( ema13 <= -0.023537 )
								if( ema2 <= 2.92613 )
									ret := 1.000000 // buy
								if( ema2 > 2.92613 )
									ret := 0.392857
							if( ema13 > -0.023537 )
								if( ema13 <= -0.018002 )
									ret := -0.214286
								if( ema13 > -0.018002 )
									ret := 0.090909
						if( ema12 > -0.004317 )
							if( ema2 <= 2.94288 )
								if( ema2 <= 2.92273 )
									ret := 0.800000 // buy
								if( ema2 > 2.92273 )
									ret := 0.100000
							if( ema2 > 2.94288 )
								if( ema3 <= 2.97786 )
									ret := 1.000000 // buy
								if( ema3 > 2.97786 )
									ret := 0.750000 // buy
					if( ema1 > 2.9851 )
						if( ema3 <= 3.00364 )
							if( ema3 <= 2.99403 )
								if( ema1 <= 3.0017 )
									ret := 0.000000
								if( ema1 > 3.0017 )
									ret := 0.500000
							if( ema3 > 2.99403 )
								if( tema <= 2.9788 )
									ret := -0.166667
								if( tema > 2.9788 )
									ret := -0.821429 // sell
						if( ema3 > 3.00364 )
							if( ema3 <= 3.02259 )
								ret := 0.000000
							if( ema3 > 3.02259 )
								ret := 0.250000
				if( ema2 > 3.02172 )
					if( ema12 <= -0.008613 )
						if( ema1 <= 3.03088 )
							if( ema12 <= -0.031419 )
								if( ema13 <= -0.065316 )
									ret := 0.500000
								if( ema13 > -0.065316 )
									ret := 1.000000 // buy
							if( ema12 > -0.031419 )
								ret := 0.000000
						if( ema1 > 3.03088 )
							ret := -0.833333 // sell
					if( ema12 > -0.008613 )
						if( ema13 <= -0.013596 )
							ret := 0.428571
						if( ema13 > -0.013596 )
							if( tema <= 3.03576 )
								ret := 1.000000 // buy
							if( tema > 3.03576 )
								if( ema2 <= 3.04221 )
									ret := 0.571429
								if( ema2 > 3.04221 )
									ret := 0.906977 // buy
			if( ema3 > 3.05735 )
				if( ema3 <= 4.14171 )
					if( ema1 <= 3.95043 )
						if( ema3 <= 3.92783 )
							if( ema3 <= 3.07769 )
								if( tema <= 2.94005 )
									ret := 1.000000 // buy
								if( tema > 2.94005 )
									ret := -0.583333
							if( ema3 > 3.07769 )
								if( tema <= 3.62978 )
									ret := 0.174526
								if( tema > 3.62978 )
									ret := 0.005599
						if( ema3 > 3.92783 )
							if( ema1 <= 3.92343 )
								if( ema2 <= 3.91138 )
									ret := -0.166667
								if( ema2 > 3.91138 )
									ret := 0.731707 // buy
							if( ema1 > 3.92343 )
								if( ema12 <= -0.04849 )
									ret := 0.666667
								if( ema12 > -0.04849 )
									ret := 0.038462
					if( ema1 > 3.95043 )
						if( tema <= 3.97396 )
							if( ema13 <= -0.060702 )
								if( ema2 <= 4.03987 )
									ret := -1.000000 // sell
								if( ema2 > 4.03987 )
									ret := -0.750000 // sell
							if( ema13 > -0.060702 )
								if( ema3 <= 3.96011 )
									ret := -0.875000 // sell
								if( ema3 > 3.96011 )
									ret := -0.125000
						if( tema > 3.97396 )
							if( ema3 <= 4.06201 )
								if( ema12 <= -0.002948 )
									ret := 0.666667
								if( ema12 > -0.002948 )
									ret := 0.047619
							if( ema3 > 4.06201 )
								if( ema12 <= -0.021294 )
									ret := 0.222222
								if( ema12 > -0.021294 )
									ret := -0.395604
				if( ema3 > 4.14171 )
					if( ema2 <= 4.4005 )
						if( ema3 <= 4.37922 )
							if( ema13 <= -0.059025 )
								if( ema3 <= 4.36794 )
									ret := 0.697248
								if( ema3 > 4.36794 )
									ret := -0.333333
							if( ema13 > -0.059025 )
								if( ema1 <= 4.35018 )
									ret := 0.255875
								if( ema1 > 4.35018 )
									ret := 0.559322
						if( ema3 > 4.37922 )
							if( ema2 <= 4.37335 )
								if( ema1 <= 4.3031 )
									ret := 0.000000
								if( ema1 > 4.3031 )
									ret := -0.777778 // sell
							if( ema2 > 4.37335 )
								if( ema3 <= 4.39225 )
									ret := 0.431373
								if( ema3 > 4.39225 )
									ret := -0.109375
					if( ema2 > 4.4005 )
						if( ema13 <= -0.07795 )
							if( ema12 <= -0.063283 )
								if( tema <= 4.27708 )
									ret := 0.750000 // buy
								if( tema > 4.27708 )
									ret := 0.000000
							if( ema12 > -0.063283 )
								if( tema <= 4.37121 )
									ret := 0.100000
								if( tema > 4.37121 )
									ret := -0.700000 // sell
						if( ema13 > -0.07795 )
							if( ema13 <= -0.050498 )
								if( ema12 <= -0.039178 )
									ret := 0.850000 // buy
								if( ema12 > -0.039178 )
									ret := 0.272727
							if( ema13 > -0.050498 )
								if( ema3 <= 4.41511 )
									ret := 0.600000
								if( ema3 > 4.41511 )
									ret := 0.909091 // buy
		if( tema > 4.38825 )
			if( ema13 <= -4.01473 )
				if( ema3 <= 114.277 )
					if( ema13 <= -6.68857 )
						if( ema13 <= -12.1911 )
							ret := -0.750000 // sell
						if( ema13 > -12.1911 )
							ret := -1.000000 // sell
					if( ema13 > -6.68857 )
						if( ema1 <= 88.571 )
							if( ema13 <= -4.37441 )
								if( ema13 <= -5.43514 )
									ret := -0.333333
								if( ema13 > -5.43514 )
									ret := -0.833333 // sell
							if( ema13 > -4.37441 )
								ret := 0.250000
						if( ema1 > 88.571 )
							if( ema2 <= 107.741 )
								if( ema12 <= -2.55045 )
									ret := -0.888889 // sell
								if( ema12 > -2.55045 )
									ret := -1.000000 // sell
							if( ema2 > 107.741 )
								ret := -0.500000
				if( ema3 > 114.277 )
					if( ema1 <= 109.45 )
						ret := 1.000000 // buy
					if( ema1 > 109.45 )
						if( ema12 <= -3.93068 )
							if( ema1 <= 113.403 )
								ret := -1.000000 // sell
							if( ema1 > 113.403 )
								ret := -0.750000 // sell
						if( ema12 > -3.93068 )
							if( ema12 <= -2.24107 )
								if( ema1 <= 149.731 )
									ret := 0.000000
								if( ema1 > 149.731 )
									ret := 0.250000
							if( ema12 > -2.24107 )
								ret := -0.200000
			if( ema13 > -4.01473 )
				if( ema3 <= 4.51165 )
					if( ema2 <= 4.48915 )
						if( ema3 <= 4.45908 )
							if( ema13 <= -0.001217 )
								if( ema12 <= -0.002749 )
									ret := -0.259259
								if( ema12 > -0.002749 )
									ret := -0.731707 // sell
							if( ema13 > -0.001217 )
								if( ema2 <= 4.40985 )
									ret := 0.423077
								if( ema2 > 4.40985 )
									ret := -0.119048
						if( ema3 > 4.45908 )
							if( ema2 <= 4.45376 )
								if( ema3 <= 4.46253 )
									ret := 1.000000 // buy
								if( ema3 > 4.46253 )
									ret := 0.400000
							if( ema2 > 4.45376 )
								if( ema1 <= 4.4355 )
									ret := -0.875000 // sell
								if( ema1 > 4.4355 )
									ret := 0.055172
					if( ema2 > 4.48915 )
						if( ema3 <= 4.49606 )
							if( ema2 <= 4.49348 )
								ret := 0.000000
							if( ema2 > 4.49348 )
								ret := -0.571429
						if( ema3 > 4.49606 )
							if( ema2 <= 4.50204 )
								if( tema <= 4.45483 )
									ret := -0.571429
								if( tema > 4.45483 )
									ret := -0.978723 // sell
							if( ema2 > 4.50204 )
								if( ema1 <= 4.53013 )
									ret := -0.200000
								if( ema1 > 4.53013 )
									ret := -1.000000 // sell
				if( ema3 > 4.51165 )
					if( ema1 <= 148.278 )
						if( ema13 <= -0.504159 )
							if( tema <= 22.3233 )
								if( ema12 <= -0.443479 )
									ret := 0.855769 // buy
								if( ema12 > -0.443479 )
									ret := 0.450000
							if( tema > 22.3233 )
								if( tema <= 112.192 )
									ret := 0.163369
								if( tema > 112.192 )
									ret := -0.015426
						if( ema13 > -0.504159 )
							if( ema13 <= 0.012671 )
								if( ema1 <= 136.631 )
									ret := 0.040358
								if( ema1 > 136.631 )
									ret := 0.396040
							if( ema13 > 0.012671 )
								if( ema1 <= 11.3401 )
									ret := 0.282192
								if( ema1 > 11.3401 )
									ret := 0.102057
					if( ema1 > 148.278 )
						if( ema12 <= -0.086786 )
							if( ema3 <= 159.443 )
								if( ema2 <= 151.985 )
									ret := -0.135802
								if( ema2 > 151.985 )
									ret := -0.404669
							if( ema3 > 159.443 )
								if( ema2 <= 161.263 )
									ret := 0.229508
								if( ema2 > 161.263 )
									ret := -0.240964
						if( ema12 > -0.086786 )
							if( ema1 <= 154.887 )
								if( ema1 <= 150.989 )
									ret := 0.375000
								if( ema1 > 150.989 )
									ret := -0.357143
							if( ema1 > 154.887 )
								if( ema2 <= 156.088 )
									ret := 1.000000 // buy
								if( ema2 > 156.088 )
									ret := 0.310345
	if( ema12 > 0.006539 )
		if( ema13 <= 0.033455 )
			if( ema2 <= 8.76377 )
				if( ema2 <= 4.19177 )
					if( tema <= 3.57101 )
						if( ema2 <= 3.48674 )
							if( ema2 <= 3.05364 )
								if( ema13 <= 0.015252 )
									ret := -0.073171
								if( ema13 > 0.015252 )
									ret := 0.375000
							if( ema2 > 3.05364 )
								if( ema3 <= 3.07673 )
									ret := -0.837209 // sell
								if( ema3 > 3.07673 )
									ret := -0.054598
						if( ema2 > 3.48674 )
							if( ema12 <= 0.014256 )
								if( ema12 <= 0.008031 )
									ret := -0.100000
								if( ema12 > 0.008031 )
									ret := 0.454545
							if( ema12 > 0.014256 )
								if( ema13 <= 0.030772 )
									ret := 1.000000 // buy
								if( ema13 > 0.030772 )
									ret := 0.777778 // buy
					if( tema > 3.57101 )
						if( ema3 <= 3.65475 )
							if( ema2 <= 3.6522 )
								if( ema2 <= 3.59778 )
									ret := -0.196970
								if( ema2 > 3.59778 )
									ret := -0.534483
							if( ema2 > 3.6522 )
								if( ema12 <= 0.015097 )
									ret := 0.916667 // buy
								if( ema12 > 0.015097 )
									ret := -0.166667
						if( ema3 > 3.65475 )
							if( ema2 <= 3.68165 )
								if( ema12 <= 0.007156 )
									ret := -0.750000 // sell
								if( ema12 > 0.007156 )
									ret := -1.000000 // sell
							if( ema2 > 3.68165 )
								if( ema1 <= 3.70487 )
									ret := 0.500000
								if( ema1 > 3.70487 )
									ret := -0.446721
				if( ema2 > 4.19177 )
					if( ema1 <= 4.29855 )
						if( ema2 <= 4.27419 )
							if( tema <= 4.29502 )
								if( ema3 <= 4.20202 )
									ret := 0.000000
								if( ema3 > 4.20202 )
									ret := 0.483871
							if( tema > 4.29502 )
								if( ema2 <= 4.2673 )
									ret := -0.125000
								if( ema2 > 4.2673 )
									ret := -0.800000 // sell
						if( ema2 > 4.27419 )
							if( ema12 <= 0.008675 )
								if( ema1 <= 4.29074 )
									ret := 0.250000
								if( ema1 > 4.29074 )
									ret := 0.000000
							if( ema12 > 0.008675 )
								if( ema3 <= 4.28064 )
									ret := 0.884615 // buy
								if( ema3 > 4.28064 )
									ret := 0.500000
					if( ema1 > 4.29855 )
						if( ema1 <= 4.52071 )
							if( ema1 <= 4.49788 )
								if( ema2 <= 4.47629 )
									ret := -0.082569
								if( ema2 > 4.47629 )
									ret := 0.714286 // buy
							if( ema1 > 4.49788 )
								if( ema1 <= 4.50957 )
									ret := -0.931034 // sell
								if( ema1 > 4.50957 )
									ret := -0.500000
						if( ema1 > 4.52071 )
							if( ema2 <= 4.69863 )
								if( ema12 <= 0.012468 )
									ret := 0.073171
								if( ema12 > 0.012468 )
									ret := 0.528662
							if( ema2 > 4.69863 )
								if( ema2 <= 4.79441 )
									ret := -0.430657
								if( ema2 > 4.79441 )
									ret := 0.042245
			if( ema2 > 8.76377 )
				if( ema3 <= 16.0255 )
					if( ema3 <= 13.4323 )
						if( ema13 <= 0.018549 )
							if( ema13 <= 0.018513 )
								if( tema <= 9.1968 )
									ret := -0.275510
								if( tema > 9.1968 )
									ret := -0.032746
							if( ema13 > 0.018513 )
								ret := 1.000000 // buy
						if( ema13 > 0.018549 )
							if( ema3 <= 8.99568 )
								if( ema3 <= 8.98913 )
									ret := -0.586667
								if( ema3 > 8.98913 )
									ret := -1.000000 // sell
							if( ema3 > 8.99568 )
								if( ema3 <= 9.44366 )
									ret := 0.081081
								if( ema3 > 9.44366 )
									ret := -0.285047
					if( ema3 > 13.4323 )
						if( ema13 <= -0.006256 )
							if( ema1 <= 14.2587 )
								ret := -0.200000
							if( ema1 > 14.2587 )
								if( ema13 <= -0.015882 )
									ret := -1.000000 // sell
								if( ema13 > -0.015882 )
									ret := -0.857143 // sell
						if( ema13 > -0.006256 )
							if( ema1 <= 13.6167 )
								ret := -1.000000 // sell
							if( ema1 > 13.6167 )
								if( ema12 <= 0.014766 )
									ret := 0.000000
								if( ema12 > 0.014766 )
									ret := -0.472727
				if( ema3 > 16.0255 )
					if( tema <= 16.6976 )
						if( ema13 <= 0.018158 )
							if( ema2 <= 16.5009 )
								if( ema12 <= 0.010663 )
									ret := 0.750000 // buy
								if( ema12 > 0.010663 )
									ret := 0.000000
							if( ema2 > 16.5009 )
								ret := 1.000000 // buy
						if( ema13 > 0.018158 )
							ret := 1.000000 // buy
					if( tema > 16.6976 )
						if( tema <= 26.7427 )
							if( ema3 <= 23.5931 )
								if( ema1 <= 23.221 )
									ret := -0.012821
								if( ema1 > 23.221 )
									ret := -0.772727 // sell
							if( ema3 > 23.5931 )
								if( ema2 <= 24.0832 )
									ret := 0.868421 // buy
								if( ema2 > 24.0832 )
									ret := 0.141509
						if( tema > 26.7427 )
							if( ema2 <= 27.5931 )
								if( ema13 <= 0.03169 )
									ret := -0.606061
								if( ema13 > 0.03169 )
									ret := 0.500000
							if( ema2 > 27.5931 )
								if( ema1 <= 124.096 )
									ret := -0.082776
								if( ema1 > 124.096 )
									ret := 0.186992
		if( ema13 > 0.033455 )
			if( tema <= 123.67 )
				if( ema13 <= 0.674953 )
					if( ema12 <= 0.017752 )
						if( ema1 <= 3.00586 )
							if( tema <= 3.00638 )
								ret := 0.750000 // buy
							if( tema > 3.00638 )
								ret := 1.000000 // buy
						if( ema1 > 3.00586 )
							if( ema2 <= 3.8564 )
								if( ema13 <= 0.04297 )
									ret := -0.312500
								if( ema13 > 0.04297 )
									ret := 0.454545
							if( ema2 > 3.8564 )
								if( ema1 <= 4.67115 )
									ret := 0.439024
								if( ema1 > 4.67115 )
									ret := 0.121816
					if( ema12 > 0.017752 )
						if( ema13 <= 0.096004 )
							if( ema3 <= 9.90853 )
								if( ema1 <= 9.8382 )
									ret := 0.009892
								if( ema1 > 9.8382 )
									ret := 0.475000
							if( ema3 > 9.90853 )
								if( tema <= 10.3436 )
									ret := -0.495652
								if( tema > 10.3436 )
									ret := -0.062475
						if( ema13 > 0.096004 )
							if( ema12 <= 0.08484 )
								if( tema <= 3.38253 )
									ret := -0.909091 // sell
								if( tema > 3.38253 )
									ret := 0.128963
							if( ema12 > 0.08484 )
								if( ema2 <= 4.36575 )
									ret := 0.480519
								if( ema2 > 4.36575 )
									ret := -0.002882
				if( ema13 > 0.674953 )
					if( ema2 <= 27.969 )
						if( tema <= 26.2161 )
							if( ema1 <= 13.0105 )
								ret := 1.000000 // buy
							if( ema1 > 13.0105 )
								if( ema13 <= 0.887198 )
									ret := -0.080645
								if( ema13 > 0.887198 )
									ret := 0.307692
						if( tema > 26.2161 )
							if( tema <= 27.7688 )
								if( tema <= 26.9793 )
									ret := -0.704545 // sell
								if( tema > 26.9793 )
									ret := 0.592593
							if( tema > 27.7688 )
								if( ema1 <= 28.4038 )
									ret := -0.816327 // sell
								if( ema1 > 28.4038 )
									ret := 0.500000
					if( ema2 > 27.969 )
						if( tema <= 45.1661 )
							if( tema <= 39.4585 )
								if( ema1 <= 30.8072 )
									ret := 0.504587
								if( ema1 > 30.8072 )
									ret := 0.100000
							if( tema > 39.4585 )
								if( ema12 <= 0.499466 )
									ret := 0.367347
								if( ema12 > 0.499466 )
									ret := 0.721739 // buy
						if( tema > 45.1661 )
							if( ema1 <= 45.0618 )
								if( ema3 <= 43.7494 )
									ret := 0.000000
								if( ema3 > 43.7494 )
									ret := -0.954545 // sell
							if( ema1 > 45.0618 )
								if( ema12 <= 0.586824 )
									ret := 0.053417
								if( ema12 > 0.586824 )
									ret := 0.175386
			if( tema > 123.67 )
				if( ema3 <= 124.506 )
					if( ema1 <= 124.778 )
						if( tema <= 124.826 )
							if( ema12 <= 0.709059 )
								if( ema3 <= 123.958 )
									ret := 0.044118
								if( ema3 > 123.958 )
									ret := -0.772727 // sell
							if( ema12 > 0.709059 )
								if( ema12 <= 1.54719 )
									ret := -0.714286 // sell
								if( ema12 > 1.54719 )
									ret := -0.222222
						if( tema > 124.826 )
							if( ema1 <= 124.426 )
								if( ema13 <= 2.68619 )
									ret := 0.400000
								if( ema13 > 2.68619 )
									ret := 1.000000 // buy
							if( ema1 > 124.426 )
								if( ema12 <= 0.835271 )
									ret := 0.294118
								if( ema12 > 0.835271 )
									ret := -0.727273 // sell
					if( ema1 > 124.778 )
						if( tema <= 126.366 )
							if( ema13 <= 0.601892 )
								ret := -1.000000 // sell
							if( ema13 > 0.601892 )
								if( tema <= 125.616 )
									ret := 0.500000
								if( tema > 125.616 )
									ret := -0.368421
						if( tema > 126.366 )
							if( ema13 <= 1.60039 )
								ret := -1.000000 // sell
							if( ema13 > 1.60039 )
								if( ema1 <= 126.59 )
									ret := -0.625000
								if( ema1 > 126.59 )
									ret := -1.000000 // sell
				if( ema3 > 124.506 )
					if( ema1 <= 149.022 )
						if( tema <= 148.501 )
							if( ema12 <= 0.318488 )
								if( ema3 <= 147.958 )
									ret := 0.052257
								if( ema3 > 147.958 )
									ret := 0.687500
							if( ema12 > 0.318488 )
								if( tema <= 142.604 )
									ret := -0.225490
								if( tema > 142.604 )
									ret := 0.088000
						if( tema > 148.501 )
							if( ema2 <= 148.078 )
								if( ema12 <= 1.28638 )
									ret := -0.018519
								if( ema12 > 1.28638 )
									ret := -0.900000 // sell
							if( ema2 > 148.078 )
								if( ema1 <= 148.857 )
									ret := -0.767857 // sell
								if( ema1 > 148.857 )
									ret := -0.111111
					if( ema1 > 149.022 )
						if( ema1 <= 162.53 )
							if( tema <= 160.021 )
								if( tema <= 157.032 )
									ret := 0.221402
								if( tema > 157.032 )
									ret := -0.106383
							if( tema > 160.021 )
								if( ema2 <= 159.187 )
									ret := 0.923077 // buy
								if( ema2 > 159.187 )
									ret := 0.230769
						if( ema1 > 162.53 )
							if( ema1 <= 169.589 )
								if( ema12 <= 0.893163 )
									ret := -0.013514
								if( ema12 > 0.893163 )
									ret := -0.473684
							if( ema1 > 169.589 )
								ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_PTON_15Min_0e74f75c(ema12, ema3, ema13, tema, ema1, ema2)

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


